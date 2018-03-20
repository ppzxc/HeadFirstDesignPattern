# HEAD FIRST DESIGN PATTERN 공부  

![github.io - 1장 strategy]()

디자인 원칙 - 애플리케이션에서 달라지는 부분을 찾아내고, 달라지지 않는 부분으로부터 분리시킨다.    
디자인 원칙 - 구현이 아닌 인터페이스에 맞춰서 프로그래밍 한다.    
디자인 원칙 - 상속보다는 구성을 활용한다.    
디자인 원칙 - 클래스는 확장에 대해서는 열려 있어야 하지만 코드 변경에 대해서는 닫혀 있어야 한다.    
디자인 원칙 - 추상화된 것에 의존하도록 만들어라. 구상 클래스에 의존하도록 만들지 않도록 한다.    

객체 지향 원칙  
- 바뀌는 부분은 캡슐화 한다.  
- 상속보다는 구성을 활용한다.  
- 서로 상호작용을 하는 객체 사이에서는 가능하면 느슨하게 결합하는 디자인을 사용해야 한다.
- 클래스는 확장에 대해서는 열려 있지만 변경에 대해서는 닫혀 있어야 한다. (OCP)
- 추상화된 것에 의존하라. 구상 클래스에 의존하지 않도록 한다.
 
2018-01-19 : 1장 STRATEGY 스트래이트지 패턴  
2018-01-22 : 2장 OBSERVER 옵저버 패턴  
2018-01-23 : 3장 DECORATOR 데코레이터 패턴
2018-01-24 : 4장 FACTORY 팩토리 패턴  



  ============================================================
  
  추상 팩토리 패턴 - 서로 연관된, 또는 의존적인 객체들로 이루어진 제품군을 생성하기 위한 인터페이스를 제공합니다. 
   구상클래스는 서브클래스에 의해 만들어집니다.  
     
  팩토리 메소드 패턴 - 객체를 생성하기 위한 인터페이스를 만듭니다.  
  어떤 클래스의 인스턴스를 만들지는 서브 클래스에서 결정하도록 합니다. 팩토리 메소드를 이용하면 인스턴스를 만드는 일을 서브클래스로 미룰 수 있습니다.
  
    