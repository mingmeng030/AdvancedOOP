public class tumbler extends CondimentDecorator{
    Beverage beverage;
    public tumbler(Beverage beverage){
        this.beverage=beverage;
    }
    public String getDescription(){
        return beverage.getDescription()+" with Tumbler";
    }
    public double cost(){
        return beverage.cost()-500;
    }
}
