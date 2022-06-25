public class sumOf8Table {
    public static void main(String[] args) {
        int n=8;
        int s=0;
        int t=1;
        for(int i=1;i<=10;i++)
        {
            t=n*i;
            s=s+t;
        }
        System.out.println("sum of table 8 is : "+s);
    }
}
