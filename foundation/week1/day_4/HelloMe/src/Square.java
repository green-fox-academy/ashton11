import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.println("How big of a square would you like?");
        Scanner boat = new Scanner(System.in);
        int rowmax = boat.nextInt();
        int rowbeg = 1;
        int rowmid = rowmax - 2;
        int rowend = 1;
        int rows = 2;
        for (int a = 0; a < rowmax; a++) {
                System.out.print("%");
        }
        System.out.print("\n");
                while (rows<rowmax) {
                    for (int b = 0; b < rowbeg; b++) {
                        System.out.print("%");
                    }
                    for (int c = 0; c < rowmid; c++) {
                        System.out.print(" ");
                    }
                    for (int d = 0; d < rowend; d++) {
                        System.out.print("%");
                    }
                System.out.print("\n");
                rows++;
                }
         for (int e = 0; e < rowmax; e++) {
             System.out.print("%");
         }
    }
}

