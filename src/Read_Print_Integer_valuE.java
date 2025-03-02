import java.util.Scanner;
import java.io.*;

class Read_Print_Integer_ValuE {
    public static void main(String[] args) {

        System.out.println("Enter the integer value:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Entered integer is: " + num);
        sc.close();
    }
}
