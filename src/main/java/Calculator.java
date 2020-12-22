public class Calculator {
    private int value;
    public Calculator() {
        value = 0;
    }

    public Calculator add(int value) {
        this.value += value;
        return this;
    }

    public Calculator sub(int value) {
        this.value -= value;
        return this;
    }

    public Calculator mul(int value) {
        this.value *= value;
        return this;
    }

    public Calculator div(int value) {
        this.value /= value;
        return this;
    }

    public int result() {
        return this.value;
    }
    public void zeroed() {
        this.value = 0;
    }
}
