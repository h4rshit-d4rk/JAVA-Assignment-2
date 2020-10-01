import java.util.Scanner;

public class SearchingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, i = 0, f = 0;
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the Array : ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to find : ");
        x = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (a[i] == x) {
                f = 1;
                break;
            } else {
                f = 0;
            }
        }
        if (f == 1) {
            System.out.println("Element found at position : " + (i + 1));
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
