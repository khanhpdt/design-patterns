package vn.khanhpdt.playgrounds.designpatterns.factorymethod;

/**
 * @author khanhpdt
 */
interface CardManager {

	/**
	 * This is the so called factory method.
	 * <p>How a card is created depends on the implementations of this interface.</p>
	 */
    Card createCard();

}
