package head.first.design.pattern.rule.observer;

import head.first.design.pattern.rule.observer.impl.CurrentConditionsDisplay;
import head.first.design.pattern.rule.observer.impl.ForecastDisplay;
import head.first.design.pattern.rule.observer.impl.StatisticsDisplay;
import head.first.design.pattern.rule.observer.impl.WeatherData;

/**
 * 서로 상호작용을 하는 객체 사이에서는 가능하면 느슨하게 결합하는 디자인을 사용해야 한다.
 *
 * 옵저버 패턴 - 한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고 자동으로 내용이 갱신되는 방식으로 일대다 의존성을 정의한다.
 *
 * 핵심 정리
 * 옵저버 패턴에서는 객체들 사이에 일대다 관계를 정의합니다.
 * 주제, 또는 Observable 객체는 동일한 인터페이스를 써서 옵저버에 연락을 합니다.
 * Observable에서는 옵저버들이 Observer 인터페이스를 구현한다는 것을 제외하면 옵저버에 대해 전혀 모르기때문에, 이들 사이의 결합흔 느슨한 결합입니다.
 * 옵저버 패턴을 이용하면 주제 객체에서 데이터를 보내거나(푸시) 옵저버가 데이터를 가져오는 (풀) 방식을 쓸 수 잇습니다. ( 풀 방식이 더 "옳은" 것으로 간주됩니다. )
 * 옵저버들한테 연락을 돌리는 순서에 절대로 의존하면 안됩니다.
 * 자바에는 범용으로 쓸 수 있는 java.util.Observable을 비롯하여 옵저버 패턴을 구현한 것들이 여럿 있습니다.
 * java.util.Observable의 몇가지 문제점에 주의 합시다.
 * 필요하면 언제든지 주저하지 말고 Observable 클래스에 상응하는 클래스를 직접 구현해 봅시다.
 * 스윙 및 여러 GUI 프레임워크에서 옵저버 패턴이 많이 쓰입니다.
 * 옵저버 패턴은 JavaBeans나 RMI를 비롯하여, GUI가 아닌 다른 부분에서도 광범위하게 쓰입니다.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
