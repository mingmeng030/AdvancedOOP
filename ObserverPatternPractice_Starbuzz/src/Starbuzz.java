import java.util.*;

public class Starbuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Beverage beverage=new HouseBlend();

        System.out.println("Welcome to Starbuzz!");
        System.out.println("What can I get for you?");

        while (true) {
            System.out.println("1. HouseBlend 2.DarkRoast 3.Decaf  / any other key : exit");
            int coffeeFlag = scan.nextInt();

            if (coffeeFlag == 1) beverage = new HouseBlend();
            else if (coffeeFlag == 2) beverage = new DarkRoast();
            else if (coffeeFlag == 3) beverage = new Decaf();
            else {
                System.out.println("Thank You:)");
                break;
            }

            while (true) {

                while(true){
                    System.out.println("1. Mocha 2. Whip 3. AlmondMilk / any other key : nothanks");
                    int extraflag = scan.nextInt();

                    if (extraflag == 1) beverage = new Mocha(beverage);
                    else if (extraflag == 2) beverage = new Whip(beverage);
                    else if (extraflag == 3) beverage = new AlmondMilk(beverage);
                    else break;
                }

                System.out.println("Do you have your own tumbler?");
                System.out.println("1. yes I have  / any other key: No I don't");
                int tumbler = scan.nextInt();

                if(tumbler==1) beverage = new tumbler(beverage);
                System.out.println(beverage.getDescription()+" : "+beverage.cost()+"원"+'\n');
                break;
            }
        }
    }
}