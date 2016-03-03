package org.khanhpdt.patterns.state;

/**
 * @author khanhpdt
 */
public class NewGameState extends GameState {

    @Override
    public void start(Game game) {
        System.out.println("Starting new game...");
        game.changeState(new OngoingGameState());
    }

}
