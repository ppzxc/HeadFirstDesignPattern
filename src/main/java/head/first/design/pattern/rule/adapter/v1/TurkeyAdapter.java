package head.first.design.pattern.rule.adapter.v1;

/**
 * Duck 객체가 모자라 Turkey 객체를 사용한다고 가정.
 * 인터페이스가 다르기 때문에 바로 사용하지 못함
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        /* 터키와 덕 둘다 fly가 있지만, 터키는 멀리 날지 못하기 때문에
         * fly를 여러번 호출해 Duck 특성 반영
         * */
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
