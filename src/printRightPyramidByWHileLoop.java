import java.util.Scanner;
public class printRightPyramidByWHileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row = sc.nextInt();
        while (row > 0) {
            int col = row;
            while (col > 0) {
                System.out.print("* ");
                col--;
            }
            System.out.println();
            row--;
        }
    }
}