import java.util.Scanner;

public class trapezoidal_rule {
    
    Scanner sc = new Scanner(System.in);

    public double y(double x)
    {
        return 1/(1+x*x);
    }

    public void trapezoidal_rule()
    {
        System.out.printf("Enter the range of definite integral: ");
        double a,b;
        a = sc.nextDouble();
        b = sc.nextDouble();
        //Number of grids. Higher value means more accuracy
        int n = 6;

        double h = (b-a)/n;
        double ans = 0;
        ans = y(a) + y(b);
        for(int i = 1;i<n;i++)
        {
            ans+=2*y(a+(i*h));
        }
        ans = ans*(h/2);

        System.out.printf("Ans = %.6f",ans);

    }

}
