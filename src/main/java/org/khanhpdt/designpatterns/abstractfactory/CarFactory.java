package org.khanhpdt.designpatterns.abstractfactory;

/**
 * @author khanhpdt
 */
public interface CarFactory {

    CarEngine createEngine();

    CarWheel createWheel();

}
