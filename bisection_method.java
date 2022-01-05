public class bisection_method{

    static final float EPS = (float)0.000001;
    
    static equation eq = new equation();

    static void bisection(double a,double b)
    {
        if(eq.func(a)*eq.func(b)>=0)
        {
            System.out.println("Wrong assumed..!");
            return;
        }
        double c = a;
        while((b-a)>=EPS)
        {
            c = (a+b)/2;
            if(eq.func(c)==0)
            {
                break;
            }
            else if(eq.func(c)*eq.func(a) < 0)
            {
                b = c;
            }
            else{
                a = c;
            }
        }
        System.out.printf("The value of root is: %.6f",c);
    }
    
    // public static void main(String[] args) {
        // double a = 0;
        // double b = 1;
    //     bisection(a,b);
    // }

}
