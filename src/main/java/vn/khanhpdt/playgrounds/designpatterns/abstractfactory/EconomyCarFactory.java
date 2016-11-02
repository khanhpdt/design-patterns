package vn.khanhpdt.playgrounds.designpatterns.abstractfactory;

/**
 * @author khanhpdt
 */
public class EconomyCarFactory implements CarFactory {

    public EconomyCarFactory() {
        System.out.println("Enter the factory for economy car...");
    }

    @Override
    public CarEngine createEngine() {
        return new EconomyCarEngine();
    }

    @Override
    public CarWheel createWheel() {
        return new EconomyCarWheel();
    }

}
