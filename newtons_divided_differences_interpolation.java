import java.util.Scanner;

public class newtons_divided_differences_interpolation {

    Scanner sc = new Scanner(System.in);

    public void divided_differences() {
        int n;
        System.out.printf("Enter Number Of Points: ");
        n = sc.nextInt();
        System.out.printf("Enter %d points in the form Xi Yi:\n",n);
        double x[] = new double[n];
        double y[][] = new double[n][n];
        for(int i = 0;i<n;i++)
        {
            x[i] = sc.nextDouble();
            y[i][0] = sc.nextDouble();
        }
        // Calculating devided difference table
        for(int j = 1;j<n;j++)
        {
            for(int i = 0;i<n-j;i++)
            {
                y[i][j] = (y[i][j-1]-y[i+1][j-1])/(x[i]-x[i+j]);
            }
        }
        //calculating formula
        double value;
        System.out.printf("Enter interpolated value: ");
        value = sc.nextDouble();

        double sum = y[0][0];
        double xsum = 1;
        for(int i = 1;i<n;i++)
        {
            xsum*=(value-x[i-1]);
            sum+=(xsum*y[0][i]);
        }
        System.out.printf("sum = %.5f\n",sum);
    }
    
}
