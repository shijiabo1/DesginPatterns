package patterns.observer;

/**
 * @author shizhenbo
 * @title: CurrentConditionDisplay
 * @projectName DesginPatterns
 * @description: TODO
 * @date 2021/11/114:08
 */
public class CurrentConditionDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressuer) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Condition: " + temp
        + "F degrees and " + humidity + " % humidity");
    }
}
