public class TestEulersMethod {
    public static void main(String[] args) {
        double approximateY = EulersMethod.approximateY(EulersMethod.getXfirst(),EulersMethod.getXlast(),EulersMethod.getY(),EulersMethod.getIncrement());
        System.out.println(EulersMethod.dydx);
        System.out.println(EulersMethod.increment);
        System.out.println(approximateY);
    }

}
