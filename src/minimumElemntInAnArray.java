import java.util.Scanner;
public class minimumElemntInAnArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter minimum number");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    int min=arr[0];
        for(int e:arr)
        {
            if(min>e)
            {
                min=e;
            }
        }

        System.out.println("minimum element in an array is : "+min);
    }

}
