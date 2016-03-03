package org.khanhpdt.patterns.state;

/**
 * @author khanhpdt
 */
public class OngoingGameState extends GameState {

    @Override
    void pause(Game game) {
        System.out.println("Pausing game...");
        game.changeState(new PausedGameState());
    }

    @Override
    public void finish(Game game) {
        System.out.println("Finishing game...");
        game.changeState(new FinishedGameState());
    }
}
