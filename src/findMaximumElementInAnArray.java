import java.util.Scanner;
public class findMaximumElementInAnArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter maximum number");
        int max=sc.nextInt();
        int[] arr=new int[10];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int e:arr)
        {
            if(e>max)
            {
                max=e;
            }
        }
        System.out.println("maximum element in an array is : "+max);
    }
}
