import java.util.Scanner;

public class BusInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of seats in the bus : ");
        int n = sc.nextInt();
        String a[][] = new String[n][2];
        int stats[] = new int[n];
        a[0][0] = sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter 1 if seat " + i + " is filled and 0 if vacant : ");
            stats[i] = sc.nextInt();
            if (stats[i] == 0) {
                a[i][0] = " ";
                a[i][1] = " ";
            } else if (stats[i] == 1) {
                System.out.println("Passenger Name : ");
                a[i][0] = sc.nextLine();
                a[i][0] = sc.nextLine();
                System.out.println("Passenger Destination : ");
                a[i][1] = sc.nextLine();
            } else {
                System.out.println("Invalid input.");
            }

        }
        for (int i = 0; i < n; i++) {
            if (stats[i] == 0)
                System.out.println("Seat " + i + " is vacant.");
            else {
                System.out.print("Seat " + i + " is Occupied ");
                System.out.print("By " + a[i][0] + " ");
                System.out.println("Going to " + a[i][1] + ".");
            }
        }
        sc.close();
    }

}
