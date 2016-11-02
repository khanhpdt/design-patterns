package vn.khanhpdt.playgrounds.designpatterns.factorymethod;

/**
 * @author khanhpdt
 */
class DebitCardManager implements CardManager {

    @Override
    public Card createCard() {
        return new DebitCard();
    }

}
