public class secant_method {
    
    static int itr = 10;
    static double eps = 0.001;

    static double f(double x)
    {
        // return ((-2.4)*x*x*x)+(18*x*x) -(21*x) -12;
        // return ((-2.4)*Math.pow(x,3))+(18*Math.pow(x,2)) -(21*x) -12;
        return Math.pow(x,3)-2*x-5;
    }
    static void secant(double x0,double x1)
    {
        double root = x1 - ((f(x1)*(x0-x1))/(f(x0)-f(x1)));
        double next = root; //- ((f(root)*(x1-root))/(f(x1)-f(root)));
        // System.out.printf("root = %.3f",f(x1));
        // for(int i = 0;i<itr;i++)
        while(Math.abs(next-x1)>eps)
        {
            next = root - ((f(root)*(x1-root))/(f(x1)-f(root)));
            x1 = root;
            root = next;
        }
        System.out.printf("root(Using Secant Method) = %.3f",next);
    }
}
