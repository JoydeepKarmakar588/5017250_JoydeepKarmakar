public class TestingFinancialForecasting {
    public static void main(String[] args) {
        double initialValue = 1000.0;
        double growthRate = 0.05;
        int periods = 10; 

        double futureValue = FinancialForecasting.calculate(initialValue, growthRate, periods);
        System.out.println("Future Value: " + futureValue);
    }
}
