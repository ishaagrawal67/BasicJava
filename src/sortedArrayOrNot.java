import java.util.Scanner;
public class sortedArrayOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[10];
        boolean issorted=true;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arr[i+1])
            {
                issorted=false;
                break;
            }
        }
        if(issorted)
            System.out.println("the given array is sorted");
        else
            System.out.println("the given array is not sorted");
    }
}
