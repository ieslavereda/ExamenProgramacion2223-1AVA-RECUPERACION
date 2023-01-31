import java.util.Scanner;

public class Exercise5 {
    private static void show(String[][] heights) {
        for (String[] person : heights) {
            for (String data : person)
                System.out.print(data + "\t");
            System.out.println();
        }
    }

    private static String recursiveSearch(String[][] heights, String name) {
        return binarySearch(heights, 0, heights.length - 1, name);
    }

    private static String binarySearch(String[][] heights, int i, int d, String name) {

        int m = (d + i) / 2;

        if (heights[m][0].equals(name)) {
            return heights[m][1];
        } else if (d < i) {
            return "The name \"" + name + "\" was not found.";
        } else if (heights[m][0].compareTo(name) < 0)
            return binarySearch(heights, i + 1, d, name);
        else
            return binarySearch(heights, i, d - 1, name);
    }

    // Iterative
    private static String iterativeSearch(String[][] heights, String name) {

        int pos = 0;

        while (pos < heights.length && !heights[pos][0].equals(name))
            pos++;

        if (pos >= heights.length)
            return "The name \"" + name + "\" was not found.";
        else
            return heights[pos][1];
    }

    public static void bubble(String[][] array) {
        int i, j;

        for (i = 1; i < array.length; i++) {
            for (j = 0; j < array.length - 1; j++) {
                if (array[j][0].compareTo(array[j + 1][0]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    private static void swap(String[][] array, int j, int i) {
        String[] aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

    private static String tallest(String[][] matrix){
        double max = Double.parseDouble(matrix[0][1]);
        String tall = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            if(max < Double.parseDouble(matrix[i][1])) {
                max = Double.parseDouble(matrix[i][1]);
                tall = matrix[i][0];
            }
        }
        return tall;
    }

    private static String smallest(String[][] matrix){
        double max = Double.parseDouble(matrix[0][1]);
        String small = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            if(max > Double.parseDouble(matrix[i][1])) {
                max = Double.parseDouble(matrix[i][1]);
                small = matrix[i][0];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] heights = {
                {"Peter", "1.85"},
                {"John", "1.86"},
                {"Thomas", "1.78"},
                {"Carl", "1.62"},
                {"Lewis", "1.68"},
                {"Michael", "1.65"},
                {"Vanessa", "1.70"},
                {"Anne", "1.69"}
        };

        System.out.println("Person's name to search: ");
        String name = sc.next();
        bubble(heights);
        show(heights);
        System.out.println("Recursively: " + recursiveSearch(heights, name));
        System.out.println("Iteratively: " + iterativeSearch(heights, name));
        System.out.println("Tallest: " + tallest(heights));
        System.out.println("Shortest: " + smallest(heights));
        sc.close();
    }


}
