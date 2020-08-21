import java.util.Scanner;

public class CodeExer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        int evenCount = 0;
        int oddCount = 0;

        System.out.print("Please enter array size: ");

        size = scanner.nextInt();
        scanner.close();
        
        int[] fiboArray = new int[size];

        for (int cntr = 0; cntr < fiboArray.length; cntr++) {
            if (cntr == 0) {
                fiboArray[cntr] = 0;
            }
            else if (cntr == 1) {
                fiboArray[cntr] = 1;
            }
            else {
                fiboArray[cntr] = fiboArray[cntr-2] + fiboArray[cntr-1];
            }
        }

        for (int number: fiboArray) {
            System.out.print(number + " ");
            if (number % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println();
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}