package vn.khanhpdt.playgrounds.designpatterns.abstractfactory;

/**
 * This is the so-called abstract factory.
 * <p>It creates a family of related objects, which are engine and wheel in this example.</p>
 *
 * @author khanhpdt
 */
interface CarFactory {

    CarEngine createEngine();

    CarWheel createWheel();

}
