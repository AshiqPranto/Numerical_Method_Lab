import java.util.Scanner;

public class polynomial_least_square_method {

    static Scanner sc = new Scanner(System.in);

    // this code is for 2nd degree polynomial

    static void polynomial_least_square() {

        System.out.println("Enter number of point");
        int n = sc.nextInt();
        int degree = 2;
        double x[] = new double[n];
        double y[] = new double[n];

        double sumxy = 0;
        double sumx2 = 0;
        double sumx = 0;
        double sumy = 0;
        double sumx3 = 0;
        double sumx4 = 0;
        double sumx2y = 0;

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            sumxy += x[i] * y[i];
            sumx2 += x[i] * x[i];
            sumx += x[i];
            sumy += y[i];
            sumx3 += x[i] * x[i] * x[i];
            sumx4 += x[i] * x[i] * x[i] * x[i];
            sumx2y += x[i] * x[i] * y[i];
        }

        double a[][] = { { n, sumx, sumx2, sumy },
                { sumx, sumx2, sumx3, sumxy },
                { sumx2, sumx3, sumx4, sumx2y } };
        n = degree;
        //making uppertriangular matrix
        for(int j = 0;j<=n;j++)
        {
            for(int i = 0;i<=n;i++)
            {
                if(i>j)
                {
                    double c = a[j][i]/a[j][j];
                    for(int k = 0;k<=n+1;k++)
                    {
                        a[i][k] = a[i][k]-c*a[j][k];
                    }
                }
            }
        }
        //backward substiturion
        double ans[] = new double[n+1];
        ans[n] = a[n][n+1]/a[n][n];
        for(int i = n-1;i>=0;i--)
        {
            double sum = 0.0;
            for(int j = n;j>i;j--)
            {
                sum+=a[i][j]*ans[j];
            }
            ans[i] = (a[i][n+1] - sum)/a[i][i];
        }

        System.out.println("The solution is: ");
        for (int i = 0; i <=n; i++) {
            System.out.printf("x[%d] = %f\n", i, ans[i]);
        }

    }
}
