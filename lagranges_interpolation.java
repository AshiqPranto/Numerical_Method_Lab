import java.util.Scanner;

public class lagranges_interpolation {
    
    Scanner sc = new Scanner(System.in);

    public void lagrange()
    {
        System.out.printf("Enter Number of points: ");
        int n;
        n = sc.nextInt();
        double x[] = new double[n];
        double y[] = new double[n];
        for(int i = 0;i<n;i++)
        {
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
        }
        double val;
        System.out.printf("Enter your interpolated value: ");
        val = sc.nextDouble();
        double result = 0.0;
        for(int i = 0;i<n;i++)
        {
            double term = y[i];
            for(int j = 0;j<n;j++)
            {
                if(i!=j)
                {
                    term*=(val-x[j])/(x[i]-x[j]);
                }
            }
            result+=term;
        }
        System.out.printf("ans = %.6f",result);
    }

}
