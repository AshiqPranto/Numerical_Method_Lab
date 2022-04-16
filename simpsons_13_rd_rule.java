import java.util.Scanner;

public class simpsons_13_rd_rule {

    Scanner sc = new Scanner(System.in);

    public double f(double x)
    {
        return Math.log(x);
    }
    
    public void simpsons() {
        System.out.printf("Enter the range of definite integral: ");
        double a,b;
        a = sc.nextDouble();
        b = sc.nextDouble();
        int n = 6;
        double h = (b-a)/n;
        double x[] = new double[10];
        double y[] = new double[10];
        for(int i = 0;i<=n;i++)
        {
            x[i] = a+i*h;
            y[i] = f(x[i]);
        }
        double result = 0.0;
        for(int i = 0;i<=n;i++)
        {
            if(i==0 || i==n)
            {
                result+=y[i];
            }
            else if(i%2!=0)
            {
                result+=4*y[i];
            }else{
                result+=2*y[i];
            }
        }
        result*=(h/3);
        System.out.printf("result = %.6f",result);
    }
    
}
