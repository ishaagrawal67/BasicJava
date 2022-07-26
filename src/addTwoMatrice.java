import java.util.Scanner;
public class addTwoMatrice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the row");
        int r=sc.nextInt();
        System.out.println("enter the coloumn");
        int c= sc.nextInt();
        int[][] arr =new int[10][10];
        int[][] arr1=new int[10][10];
        int[][] result=new int[10][10];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                result[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
