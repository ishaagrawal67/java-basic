public class maximumMinimuminarry {
    public static void findminandmax(int [] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
            else if (nums[i] < min)
                min = nums[i];
        }
        System.out.println(+max);
        System.out.println(+min);
    }

    public static void main(String[] args) {
        int [] nums={5,7,2,10,9};
        findminandmax(nums);
    }

}
