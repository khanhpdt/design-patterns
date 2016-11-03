package vn.khanhpdt.playgrounds.designpatterns.state;

/**
 * @author khanhpdt
 */
class GameClient {

    static void main(String[] args) {
        Game game = new Game();
        game.start();
        game.pause();
        game.resume();
        game.finish();
    }

}
