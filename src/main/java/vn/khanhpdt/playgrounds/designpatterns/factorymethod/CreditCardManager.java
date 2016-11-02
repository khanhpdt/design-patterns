package vn.khanhpdt.playgrounds.designpatterns.factorymethod;

/**
 * @author khanhpdt
 */
public class CreditCardManager extends CardManager {
    @Override
    protected Card createCard() {
        return new CreditCard();
    }
}
