package vn.khanhpdt.playgrounds.designpatterns.state;

class Game {

    private GameState state;

    Game() {
        System.out.println("A new game has been created.");
        state = new New();
    }

    void start() {
        state.start(this);
    }

    void changeState(GameState newState) {
        System.out.println("Game changes from " + state.getClass().getSimpleName()
                + " to " + newState.getClass().getSimpleName() + ".");
        this.state = newState;
    }

    void pause() {
        state.pause(this);
    }

    void resume() {
        state.resume(this);
    }

    void finish() {
        state.finish(this);
    }
}
