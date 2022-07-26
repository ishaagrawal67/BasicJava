import java.util.Scanner;
public class checkTheIntegerIsPresentInArrayOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the integer");
        int n= sc.nextInt();
        System.out.println("enter the size");
        int size=sc.nextInt();
        int[] arr=new int[10];
        for(int i=0;i<=size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=size;i++) {
            if (n == arr[i]) {
                System.out.println("yes Integer is present in the array");
                break;
            }
        }
    }
}
