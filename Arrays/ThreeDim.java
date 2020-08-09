public class ThreeDim {
    public static void main(String[] args) {
        int[][][] data = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 
                          {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}},
                          {{21, 22, 23}, {24, 25, 26}, {27, 28, 29}}};

        for (int[][] plane: data) {
            for (int[] row: plane) {
                for (int number: row) {
                    System.out.println(number);
                }
            }
        }
    }
}