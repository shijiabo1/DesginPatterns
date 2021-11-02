package patterns.observer;

/**
 * @author shizhenbo
 * @title: StatisticsDisplay
 * @projectName DesginPatterns
 * @description: TODO
 * @date 2021/11/114:40
 */
public class StatisticsDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("temp: " + temp + "; humidity: " + humidity + "; pressure: " + pressure);
    }
}
