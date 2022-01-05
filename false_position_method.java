import javax.lang.model.util.ElementScanner14;

public class false_position_method {

    // static final float EPS = (float)0.01;
    static int itr = 4;

    static equation eq = new equation();

    static void false_position_func(double a,double b)
    {
        if(eq.func(a)*eq.func(b)>=0)
        {
            System.out.println("Wrong assumed..!");
            return;
        }
        double c = a;
        // while ((b-a)>EPS) {
        for(int i = 0;i<itr;i++)
        {
            System.out.println("while");
            c = (a * eq.func(b) - b * eq.func(a))/(eq.func(b) - eq.func(a));

            if(eq.func(c)==0) break;
            else if((eq.func(a)*eq.func(c))<0)
            {
                b = c;
            }
            else{
                a = c;
            }
        
        }

        System.out.printf("The value of root is: %.3f\n",c);
        
    }
    
}
