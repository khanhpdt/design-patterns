package vn.khanhpdt.playgrounds.designpatterns.state;

/**
 * The state object.
 *
 * @author khanhpdt
 */
abstract class GameState {

    void start(Game game) {
        defaultStateChange();
    }

    private void defaultStateChange() {
        System.out.println("State change not supported");
    }

    void pause(Game game) {
        defaultStateChange();
    }

    public void resume(Game game) {
        defaultStateChange();
    }

    public void finish(Game game) {
        defaultStateChange();
    }
}
