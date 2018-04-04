package head.first.design.pattern.rule.templateMethod;

public abstract class AbstractClassTemplateMethod {
    /**
     * 템플릿 메소드.
     * 서브 클래스에서 알고리즘 수정을 방지하기 위해 final로 선언
     */
    final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
        hook();
    }

    abstract void primitiveOperation1();

    abstract void primitiveOperation2();

    final void concreteOperation() {
        // concreteOperation() 메소드 코드
    }

    void hook() {}
}
