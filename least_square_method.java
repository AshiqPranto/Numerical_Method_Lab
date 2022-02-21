import java.util.Scanner;

public class least_square_method {

    static Scanner sc = new Scanner(System.in);

    static void least_square()
    {
        System.out.println("Enter number of point");
        int n = sc.nextInt();
        double x[] = new double[n];
        double y[] = new double[n];

        double sumxy = 0;
        double sumx2 = 0;
        double sumx = 0;
        double sumy = 0;

        for(int i = 0;i<n;i++)
        {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            sumxy += x[i] * y[i];
            sumx2 += x[i] * x[i];
            sumx += x[i];
            sumy += y[i];
        }

        double a = (((n*sumxy)-(sumx*sumy))/((n*sumx2)-(sumx*sumx)));
        double b = (((sumx2*sumy)-(sumx*sumxy))/((n*sumx2)-(sumx*sumx)));
        
        System.out.printf("Y = "+a+"X + "+b);
    }   
}
//source - sir's slide (lecture-6)