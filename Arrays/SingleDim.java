public class SingleDim {

    public static void main(String[] args) {
        int[] my_data = {7, 15, 23, 31, 39};

        // Display all array elements one at a time
        for (int cntr = 0; cntr < my_data.length; cntr++) {
            System.out.println(my_data[cntr]);
        }

        for (int number: my_data) {
            System.out.println(number);
        }
    }
}