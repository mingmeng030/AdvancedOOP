public abstract class Beverage {
    String description="선택 사항 없음";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}