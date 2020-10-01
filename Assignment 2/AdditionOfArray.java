import java.util.Scanner;

public class AdditionOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arrays : ");
        int n = sc.nextInt();
        int array1[] = new int[n];
        int array2[] = new int[n];
        int array3[] = new int[n];
        System.out.println("Enter elements of array1 : ");
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of array2 : ");
        for (int i = 0; i < n; i++) {
            array2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            array3[i] = array1[i] + array2[i];
        }
        System.out.println("Elements of 3rd Array are : ");
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(array3[i] + ", ");
        }
        System.out.print("]");
        sc.close();
    }
}
