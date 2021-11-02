package patterns.observer.v2;

/**
 * @author shizhenbo
 * @title: Main
 * @projectName DesginPatterns
 * @description: TODO
 * @date 2021/11/116:18
 */
public class Main {
    public static void main(String[] args) {

        WeatherDataV2 weatherDataV2 = new WeatherDataV2();

        CurrentConditionDisplayV2 currentDisplayV2 = new CurrentConditionDisplayV2(weatherDataV2);
        weatherDataV2.setMeasuresments(21, 21, 33);
    }
}
