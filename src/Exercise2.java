public class Exercise2 {

    public static void main(String[] args) {
        System.out.println(count33("33aabbcc33"));
        System.out.println(count33("abc33x33x33"));
        System.out.println(count33("333"));

        System.out.println(array73(new int[]{1, 2, 73}));
        System.out.println(array73(new int[]{73, 73}));
        System.out.println(array73(new int[]{1,2,3,4}));
    }


    public static int count33(String str) {
        int i = 0, sum = 0;
        while (i < str.length()-1) {
            if(str.substring(i,i+2).equals("33")) {
                sum++;
                i++;
            }
            i++;
        }
        return sum;
    }

    public static int array73(int[] nums) {
        int i = 0, sum = 0;
        do{
            if(nums[i++]==73)
                sum++;
        }while(i< nums.length);
        return sum;
    }

}
