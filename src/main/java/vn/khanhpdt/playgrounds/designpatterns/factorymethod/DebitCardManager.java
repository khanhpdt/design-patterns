package vn.khanhpdt.playgrounds.designpatterns.factorymethod;

/**
 * @author khanhpdt
 */
class DebitCardManager extends CardManager {

    @Override
    protected Card createCard() {
        return new DebitCard();
    }

}
