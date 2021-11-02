package patterns.observer.v2;

import patterns.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author shizhenbo
 * @title: CurrentConditionDisplayV2
 * @projectName DesginPatterns
 * @description: TODO
 * @date 2021/11/116:09
 */
public class CurrentConditionDisplayV2 implements Observer, DisplayElement {
    Observable observable;
    private float temp;
    private float humidity;

    public CurrentConditionDisplayV2(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherDataV2) {
            WeatherDataV2 weatherDataV2 = (WeatherDataV2)obs;
            this.temp = weatherDataV2.getTemp();
            this.humidity = weatherDataV2.getHumidity();
            display();
        }

    }

    @Override
    public void display() {
        System.out.println("Current Condition: " + temp
                + "F degrees and " + humidity + " % humidity");
    }
}
