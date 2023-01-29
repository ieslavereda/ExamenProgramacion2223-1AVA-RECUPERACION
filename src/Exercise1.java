public class Exercise1 {

    public static void main(String[] args) {
        System.out.println(count33("33aabbcc33"));
        System.out.println(count33("abc33x33x33"));
        System.out.println(count33("333"));

        System.out.println(array73(new int[]{1, 2, 73}, 0));
        System.out.println(array73(new int[]{73, 73}, 0));
        System.out.println(array73(new int[]{1,2,3,4}, 0));
    }


    public static int count33(String str) {
        if (str.length()== 0 || str.length() == 1) return 0;
        if (str.substring(0,2).equals("33")) return 1 + count33(str.substring(2));
        return count33(str.substring(1));
    }

    public static int array73(int[] nums, int index) {
        if(index > nums.length-1) return 0;
        if(nums[index] == 73) return 1 + array73(nums,++index);
        return array73(nums,++index);
    }


}
