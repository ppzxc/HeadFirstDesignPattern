package head.first.design.pattern.rule.decorator.old.starbuzz.dp;

/**
 * 추상 클래스
 */
public abstract class Beverage {
    public String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}