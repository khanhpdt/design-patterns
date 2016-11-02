package vn.khanhpdt.playgrounds.designpatterns.abstractfactory;

/**
 * @author khanhpdt
 */
public interface CarFactory {

    CarEngine createEngine();

    CarWheel createWheel();

}
