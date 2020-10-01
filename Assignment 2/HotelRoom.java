import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, f = 0, v = 0;
        int array[][] = new int[10][];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number of rooms at " + " floor " + i + ": ");
            n = sc.nextInt();
            array[i] = new int[n];
            System.out.println("Enter 1 for FILLED Room or 0 for VACANT Room ");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {
                    f++;
                } else {
                    v++;
                }
            }
        }
        int total = f + v;
        System.out.println("Total number of rooms = " + total);
        System.out.println("Total number of filled rooms = " + f);
        System.out.println("Total number of Vaccant rooms = " + v);
        sc.close();
    }
}
