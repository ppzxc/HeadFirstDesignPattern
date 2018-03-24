package head.first.design.pattern.rule.observer.impl;

import java.util.Observable;

/**
 * 주제가 되는 기상 정보
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
     * - setChanged(), Observable 사용자가 노티파이 순간을 컨트롤하기 위해 지원.
     *   - 내부 상태를 changed=true로 바꾼다.
     *   - 상태가 바뀌었다는 내부 변수
     *   - 해당 메소드로 언제 알릴지 세부적으로 컨트롤 가능하다
     *   - 상태가 밀리세컨 단위로 보고되는 경우, 사용자가 해당 메소드로 컨트롤 가능
     * - notifyObservers는 옵저버에게 알린다.
     *   - notify는 changed를 체크 하며, 상태가 바뀐걸 체크한다.
     */
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
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
