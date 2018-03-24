package head.first.design.pattern.rule.observer.impl;

import head.first.design.pattern.rule.observer.dp.DisplayElement;
import java.util.Observable;
import java.util.Observer;

/**
 * 똑같다.
 * 옵저버와 디스플레이를 구현하며, 내부 세부적인 사항만 조금 다르다.
 */
public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;
	private float lastPressure;

	/**
	 * 생성자
	 *
	 * @param observable the observable
	 */
	public ForecastDisplay(Observable observable) {
		observable.addObserver(this);
	}

	@Override
	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)observable;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}

	@Override
	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
