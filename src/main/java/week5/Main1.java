
package week5;

import java.time.LocalDate;

public class Main1 {
    public static void main(String[] args) {
        HangHoa hang = new HangHoa("23DTxa", "May lanh doi moi", 358);
        System.out.println(hang.toString());
        hang.xuatThongTin();
        
        HangDienMay dienMay = new HangDienMay(LocalDate.now(), 220, 1500, "Intel I7 13700k", "CPU may tinh", 400);
        dienMay.xuatThongTin();
        
        HangThucPham tp = new HangThucPham(LocalDate.parse("2024-12-12"), LocalDate.MAX, hang);
        tp.xuatThongTin();
    }
}
