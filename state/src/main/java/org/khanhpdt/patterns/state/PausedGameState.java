package org.khanhpdt.patterns.state;

/**
 * @author khanhpdt
 */
public class PausedGameState extends GameState {

    @Override
    public void resume(Game game) {
        System.out.println("Resuming game...");
        game.changeState(new OngoingGameState());
    }
}
