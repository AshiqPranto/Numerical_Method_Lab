public class newton_raphson_method {

    static final double EPS = 0.001;

    static double func(double x)
    {
        return (x*x*x)-(2*x)-5;
    }
    static double derivFunc(double x)
    {
        return (3*x*x) - 2;
    }
    static void newton_raphson(double x)
    {
        double h = func(x)/derivFunc(x);
        while(Math.abs(h) >= EPS)
        {
            h = func(x)/derivFunc(x);
            x = x-h;
        }
        System.out.printf("Root(using Newton Rephson Method) : %.3f\n\n",x);
    }
    
}
