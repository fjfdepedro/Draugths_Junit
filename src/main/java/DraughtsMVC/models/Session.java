package DraughtsMVC.models;

public class Session {
    private final State state;
    private final Game game;

    public Session() {
        this.state = new State();
        this.game = new Game();
    }

    public void resume() {
        this.game.clear();
        this.state.reset();
    }

    public void next() {
        this.state.next();
    }

}
