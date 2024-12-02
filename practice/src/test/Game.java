package test;

public class Game implements Playable {

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }

    @Override
    public void play() {
        System.out.println("game play");
    }
}
