import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the array element : ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of array are : ");
        System.out.print("[");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
        sc.close();
    }
}
