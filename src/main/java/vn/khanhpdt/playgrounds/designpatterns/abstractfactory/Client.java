package vn.khanhpdt.playgrounds.designpatterns.abstractfactory;

/**
 * @author khanhpdt
 */
public class Client {

    public static void main(String[] args) {
        CarFactory economyCarFactory = new EconomyCarFactory();
        economyCarFactory.createEngine();
        economyCarFactory.createWheel();

        System.out.println("");

        CarFactory luxuryCarFactory = new LuxuryCarFactory();
        luxuryCarFactory.createEngine();
        luxuryCarFactory.createWheel();
    }

}
