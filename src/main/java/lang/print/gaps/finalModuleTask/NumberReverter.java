package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int third = number;
        int first = ((number % 10) * 100);
        int second = (((number /= 10) % 10) * 10);
        third = third /= 100;
        System.out.println(first + second + third);
    }
}
