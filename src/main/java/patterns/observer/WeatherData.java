package patterns.observer;

import java.util.ArrayList;

/**
 * @author shizhenbo
 * @title: WeatherData
 * @projectName DesginPatterns
 * @description: TODO
 * @date 2021/11/113:41
 */
public class WeatherData implements Subject{

    private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i > 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temp, humidity, pressure);
        }
    }

    public void measuresmentChanged() {
        notifyObserver();
    }

    public void setMeasuresments(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure =pressure;
        measuresmentChanged();
    }
}
