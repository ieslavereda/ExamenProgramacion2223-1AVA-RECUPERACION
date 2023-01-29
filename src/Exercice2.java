public class Exercice2 {
    public static void main(String[] args) {
        String[][] matrix = {
                {"09", "08", "05", "04"},
                {"11", "45", "35", "20"},
                {"32", "33", "07", "00"}
        };

        show(matrix);
        System.out.println();
        String[][] matrix2 = mirrorMatrix(matrix);
        show(matrix2);
        System.out.println();
        String[][] matrix3 = transposeMatrix(matrix);
        show(matrix3);
        System.out.println();
        String[][] matrix4 = sumMatrix(matrix);
        show(matrix4);
    }

    public static String[][] mirrorMatrix(String[][] matrix) {
        String[][] aux = new String[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                aux[i][j] = matrix[i][(matrix[0].length - 1) - j];
            }
        }
        return aux;
    }

    public static String[][] transposeMatrix(String[][] matrix) {
        String[][] aux = new String[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                aux[i][j] = matrix[j][i];
            }
        }
        return aux;
    }

    public static String[][] sumMatrix(String[][] matrix) {
        String[][] mirror = mirrorMatrix(matrix);
        String[][] sumM = new String[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sumM[i][j] = String.valueOf(Integer.parseInt(matrix[i][j])+Integer.parseInt(mirror[i][j]));
            }
        }
        return sumM;
    }
    public static void show(String[][] matrix) {
        for (String[] vector : matrix) {
            for (String element : vector)
                System.out.print(element+" ");
            System.out.println();
        }
    }

}


// 09   08  05  04
// 11   45  35  20
// 32   33  07  00

// 04   05  08  09
// 20   35  45  11
// 00   07  33  32

// 09   11  32
// 08   45  33
// 05   35  07
// 04   20  00

