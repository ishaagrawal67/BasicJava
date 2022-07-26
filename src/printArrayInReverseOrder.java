import java.util.Scanner;
public class printArrayInReverseOrder{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[10];
        for(int i=0;i<=n;i++)
            arr[i]=sc.nextInt();
        for(int i=n;i>=0;i--)
        {
            System.out.println(arr[i]);
        }

    }
}