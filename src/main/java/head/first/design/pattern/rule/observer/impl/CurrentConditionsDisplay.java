package head.first.design.pattern.rule.observer.impl;

import head.first.design.pattern.rule.observer.dp.DisplayElement;
import java.util.Observable;
import java.util.Observer;

/**
 * 옵저버, 구독자가 됨
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    /**
     * 옵저버블 객체를 저장해놓고 구독, 해지에 사용
     */
    Observable observable;
    private float temperature;
    private float humidity;

    /**
     * 생성자, 옵저버블 객체를 아규먼트로 받음
     *
     * @param observable the observable
     */
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions : " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable oservable, Object arg) {
        if (oservable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) oservable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}