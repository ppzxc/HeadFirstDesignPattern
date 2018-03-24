package head.first.design.pattern.rule.observer;

import head.first.design.pattern.rule.observer.impl.CurrentConditionsDisplay;
import head.first.design.pattern.rule.observer.impl.ForecastDisplay;
import head.first.design.pattern.rule.observer.impl.StatisticsDisplay;
import head.first.design.pattern.rule.observer.impl.WeatherData;

/**
 * 기상청
 */
public class WeatherStation {

    /**
     * 메인문
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); // 웨더 데이터는 구독의 주제가 된다.

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
