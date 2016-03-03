package org.khanhpdt.patterns.state;

public class Game {

    private GameState state;

    public Game() {
        System.out.println("A new game has been created.");
        state = new NewGameState();
    }

    void start() {
        state.start(this);
    }

    public void changeState(GameState newState) {
        System.out.println("Game changes from " + state.getClass().getSimpleName()
                + " to " + newState.getClass().getSimpleName() + ".");
        this.state = newState;
    }

    public void pause() {
        state.pause(this);
    }

    public void resume() {
        state.resume(this);
    }

    public void finish() {
        state.finish(this);
    }
}
