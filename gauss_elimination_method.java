import java.util.Scanner;

public class gauss_elimination_method {

    static Scanner sc = new Scanner(System.in);

    static void print(double[][] mat, int sz) {
        for (int i = 1; i <= sz; i++) {
            for (int j = 1; j <= sz; j++) {
                System.out.printf("%f,  ", mat[i][j]);
            }
            System.out.println();
        }
    }

    static void gauss_elimination() {
        double a[][] = new double[500][500];
        int n;
        System.out.println("Enter the number of rows ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n+1; j++) {
                System.out.printf("arr[%d][%d] = ", i, j);
                a[i][j] = sc.nextDouble();
            }
        }
        // making uppertriangular matrix
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= n; i++) {
                if (i > j) {
                    double c = a[i][j] / a[j][j];
                    for (int k = 1; k <= n + 1; k++) {
                        a[i][k] = a[i][k] - c * a[j][k];
                    }
                }
            }
        }
        // backward substitution
        double x[] = new double[n + 5];
        x[n] = a[n][n + 1] / a[n][n];
        for (int i = n - 1; i >= 1; i--) {
            double sum = 0;
            for (int j = n; j > i; j--) {
                sum += a[i][j]*x[j];
            }
            x[i] = (a[i][n + 1] - sum) / a[i][i];
        }
        System.out.println("The solution is: ");
        for(int i = 1;i<=n;i++)
        {
            System.out.printf("x[%d] = %f\n",i,x[i]);

        }

    }
}