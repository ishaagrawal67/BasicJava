import java.util.Scanner;
public class calculateTheAverageOfTheMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n= sc.nextInt();
        int s=0;
        int[] marks=new int[n];
        System.out.println("enter the marks in array");
        for(int i=0;i<n;i++)
            marks[i]=sc.nextInt();
        for(int ele:marks)
        {
            s=s+ele;
        }
        int average=s/n;
        System.out.println("the average of the marks is: "+average);
    }
}
