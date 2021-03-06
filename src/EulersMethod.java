
public class EulersMethod {
    public static double yfirst, dydx, increment, xfirst, xlast, b;

    public static double getY() {
        return yfirst = IO.getInt("Enter first y-coordinate");
    }

    public static double getXfirst() {
        return xfirst = IO.getDouble("Enter first x-coordinate");
    }

    public static double getXlast() {
        return xlast = IO.getDouble("What x value would you like to approximate?");
    }

    public static double getIncrement() {

        return increment = (Math.abs(xlast - xfirst) / IO.getDouble("Enter number of steps"));
    }

    public static double getDydx(double x, double y){
        return dydx = x / y;
    }
    public static void pointSlopeTangent(double x, double y) {

        b = getDydx(x,y) * x + y;
    }

    public static double approximateY(double firstX, double lastX, double firstY, double increment) {

        double y = firstY;
        double x = firstX;
        for (double i = firstX; i < lastX; i += increment) {
            pointSlopeTangent(x,y);
            y = dydx * -x + b;
            x += increment;
        }
        return y;
    }


}
