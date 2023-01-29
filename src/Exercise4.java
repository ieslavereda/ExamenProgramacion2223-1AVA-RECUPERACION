public class Exercise4 {
    public static void main(String[] args) {
        int[][] matrix = ident(6);
        for (int[] vector : matrix) {
            for (int element : vector)
                System.out.print(element + " ");
            System.out.println();
        }
    }

    public static int[][] ident(int size) {
        int[][] aux = new int[size][size];
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux[0].length; j++) {
                if (i == j)
                    aux[i][j] = 1;
                else
                    aux[i][j] = 0;
            }
        }
        return aux;
    }

}
