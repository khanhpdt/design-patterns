package org.khanhpdt.designpatterns.factorymethod;

/**
 * @author khanhpdt
 */
public class DebitCardManager extends CardManager {
    @Override
    protected Card createCard() {
        return new DebitCard();
    }
}
