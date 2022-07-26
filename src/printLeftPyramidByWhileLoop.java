import java.util.Scanner;
public class printLeftPyramidByWhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row=sc.nextInt();
        int i=0, k=0;
        while(i<row)
        {
            int j=2*(row-i);
            while ( j>=0)
            {
                System.out.print(" ");
                j--;
            }
            j=0;
            while (j<=i)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
