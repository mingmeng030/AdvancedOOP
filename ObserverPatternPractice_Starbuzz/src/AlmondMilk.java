public class AlmondMilk extends CondimentDecorator {
    Beverage beverage;

    public AlmondMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " + AlmondMilk";
    }

    public double cost() {
        return beverage.cost() + 500;
    }
}