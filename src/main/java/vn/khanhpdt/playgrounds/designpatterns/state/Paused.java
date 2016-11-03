package vn.khanhpdt.playgrounds.designpatterns.state;

/**
 * @author khanhpdt
 */
class Paused extends GameState {

    @Override
    public void resume(Game game) {
        System.out.println("Resuming game...");
        game.changeState(new Ongoing());
    }
}
