import java.util.Scanner;
public class createOfArrayAndSumOfThat {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("print the size");
        int n=sc.nextInt();
        int s=0;
        int[] arr=new int[10];
        System.out.println("print the array");
        for(int i=0;i<=n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=n;i++)
        {
            s=s+arr[i];
        }
        for(int i=0;i<=n;i++)
        {
            System.out.println("created array is:"+arr[i]);
        }
        System.out.println("sum of the created array is: "+s);
    }
}
