package head.first.design.pattern.rule.adapter.v1;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey Say");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nDuck Say");
        testDuck(duck);

        System.out.println("\nTurkeyAdapter Say");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
