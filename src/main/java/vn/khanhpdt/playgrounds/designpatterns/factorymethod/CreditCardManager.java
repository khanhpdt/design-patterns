package vn.khanhpdt.playgrounds.designpatterns.factorymethod;

/**
 * @author khanhpdt
 */
class CreditCardManager extends CardManager {

    @Override
    protected Card createCard() {
        return new CreditCard();
    }

}
