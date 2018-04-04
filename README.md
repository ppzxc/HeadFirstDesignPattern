# HEAD FIRST DESIGN PATTERN 공부  

2018-01-19 : 1장 STRATEGY 스트래이트지 패턴    
2018-01-22 : 2장 OBSERVER 옵저버 패턴    
2018-01-23 : 3장 DECORATOR 데코레이터 패턴  
2018-01-24 : 4장 FACTORY 팩토리 패턴    
  
2018-03-20 : 1장부터 다시 시작.....ㅠㅠ
2018-03-24 : 2장 복습! 블로그엔 포스팅 안함 [2장 Observer](https://github.com/JungHa-Cho/HeadFirstDesignPattern/tree/master/src/main/java/head/first/design/pattern/rule/observer)    
2018-03-24 : 3장 데코레이터, 장식한다. [3장 Decorator](https://github.com/JungHa-Cho/HeadFirstDesignPattern/tree/master/src/main/java/head/first/design/pattern/rule/decorator/v1)     
 - 직접 자바 I/O를 확장해 데코레이터 패턴으로 장식해 내가 필요한 요소로 정의할수 있다.         
 - 복잡해 질수 있음.. 주의점        

2018-03-25 : 4장 팩토리 패턴, 의존성 뒤집기 원칙.. [4장 팩토리 패턴, 추상 팩토리](https://github.com/JungHa-Cho/HeadFirstDesignPattern/tree/master/src/main/java/head/first/design/pattern/rule/factory/v3)                  
- 팩토리 메소드 패턴은 객체를 생성하기 위한 인터페이스를 만들고, 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정하도록 한다. 팩토리 메소드를 사용하면 인스턴스를 만드는 일을 서브클래스로 미룰 수 있다.                                          
- 추상 팩토리 패턴에서는 인터페이스를 이용하여 서로 연관된, 또는 의존하는 객체를 구상 클래스를 지정하지 않고도 생성할 수 있다.                    

2018-03-27 : 5장 싱글턴 [5장 싱글턴](https://github.com/JungHa-Cho/HeadFirstDesignPattern/tree/master/src/main/java/head/first/design/pattern/rule/singleton)                     
2018-03-27 : 6장  커맨드 [6장 커맨드](https://github.com/JungHa-Cho/HeadFirstDesignPattern/tree/master/src/main/java/head/first/design/pattern/rule/command)
2018-04-03 : 7장 어댑터 [7장 어댑터](https://github.com/JungHa-Cho/HeadFirstDesignPattern/tree/master/src/main/java/head/first/design/pattern/rule/adapter)
2018-04-04 : 7장 파사드 [7장 파사드](https://github.com/JungHa-Cho/HeadFirstDesignPattern/tree/master/src/main/java/head/first/design/pattern/rule/facade)                
2018-04-04 : 8장 템필릿 메소드 [8장 템플릿 메소드](https://github.com/JungHa-Cho/HeadFirstDesignPattern/tree/master/src/main/java/head/first/design/pattern/rule/templateMethod)              




디자인 패턴
============

[github.io - 1장 strategy](https://jungha-cho.github.io/2018/03/20/%EB%94%94%EC%9E%90%EC%9D%B8%ED%8C%A8%ED%84%B4-STRATEGY/)
[github.io - 5장 singleton](https://jungha-cho.github.io/2018/03/27/%EB%94%94%EC%9E%90%EC%9D%B8%ED%8C%A8%ED%84%B4-SINGLETON/)       
    
디자인 원칙 1 - 애플리케이션에서 달라지는 부분을 찾아내고, 달라지지 않는 부분으로부터 분리시킨다.    
디자인 원칙 2 - 구현이 아닌 인터페이스에 맞춰서 프로그래밍 한다.      
디자인 원칙 3 - 상속보다는 구성을 활용한다.    
디자인 원칙 4 - 서로 상호작용 하는 객체 사이에서는 가능하면 느슨하게 결합하는 디자인을 사용해야 한다.              
디자인 원칙 5 - 추상화된 것에 의존하도록 만들어라. 구상 클래스에 의존하도록 만들지 않도록 한다.         
디자인 원칙 6 - 최소 지식 원칙, 정말 친한 친구하고만 얘기하라.
디자인 원칙 7 - 헐리우드 원칙, 먼저 연락하지 마세요. 저희가 연락 드리겠습니다.

커맨드 패턴 - 작업 처리 로직과 작업의 종류를 분리 시킬 수 있음, 빗대어 얘기하자면 Thread Pool, 작업 종류는 상관하지 않고 규칙에 맞춰 들어온 작업만 수행 시키는 스레드풀. 즉, 작업 처리 로직과 작업의 종류를 분리 시켜 느슨한 결합을 완성하고, 달라지는 부분을 캡슐화 시킬 수 있다.             