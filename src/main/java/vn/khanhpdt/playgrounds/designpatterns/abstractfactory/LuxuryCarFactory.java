package vn.khanhpdt.playgrounds.designpatterns.abstractfactory;

/**
 * @author khanhpdt
 */
class LuxuryCarFactory implements CarFactory {

    LuxuryCarFactory() {
        System.out.println("Enter factory for luxury car...");
    }

    @Override
    public CarEngine createEngine() {
        return new LuxuryCarEngine();
    }

    @Override
    public CarWheel createWheel() {
        return new LuxuryCarWheel();
    }

}
