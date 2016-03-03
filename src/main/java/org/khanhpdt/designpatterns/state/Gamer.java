package org.khanhpdt.designpatterns.state;

/**
 * @author khanhpdt
 */
public class Gamer {

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
        game.pause();
        game.resume();
        game.finish();
    }

}
