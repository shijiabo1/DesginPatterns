package patterns.observer;

/**
 * @author shizhenbo
 * @title: WeatherStation
 * @projectName DesginPatterns
 * @description: TODO
 * @date 2021/11/114:18
 */
public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasuresments(80,65,30.4f);
        weatherData.setMeasuresments(82,70,22.4f);
        weatherData.setMeasuresments(78,56,30.4f);
    }
}
