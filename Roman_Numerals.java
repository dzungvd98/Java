import java.util.*;

public class Roman_Numerals {
    
    public static String TransferDecimalToRoman(int number) {
        StringBuffer result = new StringBuffer();
        if(number / 1000 > 0) {
            int n = number/1000;
            number %= 1000;
            while(n > 0) {
                result.append("M");
                n--;
            }
        }

        if(number / 100 > 0) {
            int n = number/100;
            if(n == 9) {
                result.append("CM");
                n = 0;
            } else if(n == 4) {
                result.append("CD");
                n = 0;
            } else if(n > 4) {
                result.append("D");
                n = n%5;
            }
            while(n > 0) {
                result.append("C");
                n--;
            }

            number %= 100;
        }

        if(number / 10 > 0) {
            int n = number/10;
            System.out.println(n);
            if(n == 9) {
                result.append("XC");
                n = 0;
            } else if(n == 4) {
                result.append("XL");
                n = 0;
            } else if(n > 4) {
                result.append("L");
                n = n%5;
            }
            while(n > 0) {
                result.append("X");
                n--;
            }

            number %= 10;
        }

        if(number > 0) {
            int n = number;
            if(n == 9) {
                result.append("IX");
                n = 0;
            } else if(n == 4) {
                result.append("IV");
                n = 0;
            } else if(n > 4) {
                result.append("V");
                n = n%5;
            }
            while(n > 0) {
                result.append("I");
                n--;
            }
        }

        return result.toString();

    }

    public static int TransferRomanNumberToDecimal(String romanNumber) {

        HashMap<Character, Integer> mapRoman = new HashMap<>();
        mapRoman.put('I', 1);
        mapRoman.put('V', 5 );
        mapRoman.put('X', 10);
        mapRoman.put('L', 50);
        mapRoman.put('C', 100);
        mapRoman.put('D', 500);
        mapRoman.put('M', 1000);
        StringBuffer sc = new StringBuffer(romanNumber);
        int result = 0;
        for(int i = 0; i < sc.length() - 1; i++) {
            int num1 = mapRoman.get(sc.charAt(i));
            int num2 = mapRoman.get(sc.charAt(i+1));
            if(num1 < num2)  {
                result -= num1;
            }else {
                result += num1;
            }
        }
        result += mapRoman.get(sc.charAt(sc.length() - 1));
        return result;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String romanNumber = TransferDecimalToRoman(number);
        System.out.println(romanNumber);
        scanner.nextLine();
        String romNum = scanner.nextLine();
        int result = TransferRomanNumberToDecimal(romNum);
        System.out.println(result);
        scanner.close();
    }


}
