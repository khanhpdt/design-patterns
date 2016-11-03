package vn.khanhpdt.playgrounds.designpatterns.state;

/**
 * @author khanhpdt
 */
class Ongoing extends GameState {

    @Override
    void pause(Game game) {
        System.out.println("Pausing game...");
        game.changeState(new Paused());
    }

    @Override
    public void finish(Game game) {
        System.out.println("Finishing game...");
        game.changeState(new Finished());
    }
}
