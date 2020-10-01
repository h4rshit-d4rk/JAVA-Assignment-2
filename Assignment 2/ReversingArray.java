import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter elements of the Array : ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++, n--) {
            int temp = array[i];
            array[i] = array[n - 1];
            array[n - 1] = temp;
        }
        System.out.println("Reversed Array is :");
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
        sc.close();
    }
}
