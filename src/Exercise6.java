

public class Exercise6 {


    public static void main(String[] args) {

        int i = (int) (Math.random() * 10);
        System.out.println(i);
            if(i>0 && i<4) {
                if (i == 3 || i == 2)
                    System.out.println("A");
                System.out.println("B");
            }else if(i==5 || i<7){
                System.out.println("C");
            }else
                System.out.println("D");

        switch (i) {
            case 2:
            case 3:
                System.out.println("A");
            case 1:
                System.out.println("B");
                break;
            case 0:
            case 4:
            case 5:
            case 6:
                System.out.println("C");
                break;
            default:
                System.out.println("D");
        }


    }


}
