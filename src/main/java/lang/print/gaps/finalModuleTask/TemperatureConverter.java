package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float output = (temperatureCelsius * 1.8f) + 32;
        System.out.println(output);
    }
}
