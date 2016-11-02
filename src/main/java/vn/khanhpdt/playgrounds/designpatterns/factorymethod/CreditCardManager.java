package vn.khanhpdt.playgrounds.designpatterns.factorymethod;

/**
 * @author khanhpdt
 */
class CreditCardManager implements CardManager {

    @Override
    public Card createCard() {
        return new CreditCard();
    }

}
