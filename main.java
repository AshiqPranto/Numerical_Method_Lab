public class main {
    public static void main(String[] args) {

        // bisection_method bisection = new bisection_method();
        double a = 2;
        double b = 3;
        // bisection.bisection(a, b);

        // false_position_method false_position = new false_position_method();
        // false_position.false_position_func(a, b);

        newton_raphson_method newton = new newton_raphson_method();
        newton.newton_raphson(-20);

    }
}
