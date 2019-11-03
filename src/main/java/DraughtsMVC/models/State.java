package DraughtsMVC.models;

public class State {

    private StateValue value;

    public State () {
        this.value = StateValue.INITIAL;
    }

    public StateValue getValueState() {
        return this.value;
    }

    public void setValueState(StateValue statevalue) {
        this.value = statevalue;
    }

    public void reset() {
    }

    public void next() {
    }
}
