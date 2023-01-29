public class Exercice1 {

    public static void main(String[] args) {
        System.out.println(count11("11aabbcc11"));
        System.out.println(array11(new int[]{1, 2, 11}, 0));
    }


    public static int count11(String str) {
        if (str.length()== 0 || str.length() == 1) return 0;
        if (str.substring(0,2).equals("11")) return 1 + count11(str.substring(2));
        return count11(str.substring(1));
    }

    public static int array11(int[] nums, int index) {
        if(index > nums.length-1) return 0;
        if(nums[index] == 11) return 1 + array11(nums,++index);
        return array11(nums,++index);

    }


}
