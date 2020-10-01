import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += array[i];
        }
        System.out.println("Sum of the elements of the array is :" + sum);
        sc.close();
    }
}
