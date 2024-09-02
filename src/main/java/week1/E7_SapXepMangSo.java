package week1;


class E7_SapXepMangSo {
    public static void SapXepMangSo(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                    int cmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = cmp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int nums[] = {4,2,1,5,7,3};
        SapXepMangSo(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
