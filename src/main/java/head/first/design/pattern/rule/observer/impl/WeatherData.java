package head.first.design.pattern.rule.observer.impl;

import java.util.Observable;

/**
 * Loose Coupling 느슨한 결합의 위력
 *
 * - 디자인 원칙 서로 상호작용을 하는 객체 사이에서는 가능하면 느슨하게 결합하는 디자인을 사용해야 한다.
 *
 * 느슨하게 결합하는 디자인을 사용하면 변경사항이 생겨도 무난히 처리할수 있는 유연한 객체지향 시스템을 구축할 수 있습니다. 객체 사이의 상호 의존성을 최소화할 수 있기
 * 때문이죠.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 생성자
     */
    public WeatherData() {

    }

    /**
     * 현재 온도 리턴
     *
     * @return the temperature
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * 현재 습도 리턴
     *
     * @return the humidity
     */
    public float getHumidity() {
        return humidity;
    }

    /**
     * 현재 기압? 리턴
     *
     * @return the pressure
     */
    public float getPressure() {
        return pressure;
    }

    /**
     * 기상 관측값이 갱신될때마다 알려주기 위한 메소드
     */
    public void measurementsChanged() {
        setChanged(); // Observable 사용자가 노티파이 순간을 컨트롤하기 위해 지원
        notifyObservers(); // 옵저버에게 알린다.
    }

    /**
     * 온도 습도 기압을 셋팅한다.
     *
     * @param temperature the temperature
     * @param humidity the humidity
     * @param pressure the pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
        System.out.println("");
    }
}
