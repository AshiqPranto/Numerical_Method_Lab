import java.util.Scanner;

public class newtons_forward_interpolation {

    Scanner sc = new Scanner(System.in);

    public void forward_interpolation() {
        
        int n;
        System.out.println("Enter the number of given value: ");
        n = sc.nextInt();
        System.out.printf("Enter %d numbers\n",n);
        double x[] = new double[n];
        double y[][] = new double[n][n];    
        for(int i = 0;i<n;i++)
        {
            x[i] = sc.nextDouble();
            y[i][0] = sc.nextDouble();
        }
        for(int j = 1;j<n;j++)
        {
            for(int i = 0;i<n-j;i++)
            {
                y[i][j] = y[i+1][j-1] - y[i][j-1];
            }
        }
        double sum = y[0][0];
        double val;
        System.out.printf("Enter your x value: ");
        val = sc.nextDouble();
        double h = x[1]-x[0];
        double hsum = 1;
        double xsum = 1;
        int fact = 1;
        for(int i = 1;i<n;i++)
        {
            xsum = xsum*(val-x[i-1]);
            hsum = hsum*h;
            fact = fact*i;
            sum += y[0][i]*xsum/(hsum*fact);
        }
        System.out.printf("sum = %.08f",sum);
        
    }

}
