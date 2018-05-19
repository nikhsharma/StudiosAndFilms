package models.People;

public class Actor extends Person {

    private int cash;

    public Actor(String name, int cash) {
        super(name);
        this.cash = cash;
    }

    public Actor() {
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}
