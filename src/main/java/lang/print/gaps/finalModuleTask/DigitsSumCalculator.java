package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int first = number;
        first /= 1000;
        int second = number;
        second = (second %1000) / 100;
        int third = number;
        third = (third % 100) / 10;
        int fourth = number % 10;

        System.out.println(first + second + third + fourth);
    }
}
