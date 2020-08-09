public class MultiDim {
    public static void main(String[] args) {
        int[][] my_data =  { 
            {3, 6, 9, 12, 15}, 
            {5, 10, 15, 20, 25}, 
            {7, 14, 21, 28, 35}
        };

        // Display all array elements one at a time
        for (int row = 0; row < my_data.length; row++) {
            for (int col = 0; col < my_data[row].length; col++) {
                System.out.print(my_data[row][col] + " ");
            }

            System.out.println();
        }

        System.out.println();

        // Display all array elements one at a time
        for (int[] row: my_data) {
            for (int number: row) {
                System.out.print(number + " ");
            }

            System.out.println();
        }
    }
}