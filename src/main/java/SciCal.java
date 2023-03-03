import java.util.Scanner;
public class SciCal {
    public static void main(String [] args) {
        //System.out.println("Hello world");
        SciCal obj=new SciCal();
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(obj.factorial(n));
    }
    public int factorial(int n)
    {
        int ans=1;
        for(int i=1;i<=n;i++)
        {
            ans=ans*i;
        }
        return ans;
    }
}
