package vn.khanhpdt.playgrounds.designpatterns.state;

/**
 * @author khanhpdt
 */
class New extends GameState {

    @Override
    public void start(Game game) {
        System.out.println("Starting new game...");
        game.changeState(new Ongoing());
    }

}
