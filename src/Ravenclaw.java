public class Ravenclaw extends Hogwarts {
    private int witty;
    private int mind;
    private int wise;
    private int creative;
    private int score;

    public Ravenclaw(String fullName, int magicPower, int distanceTransgression, int witty, int mind, int wise, int creative) {
        super(fullName, magicPower, distanceTransgression);
        this.witty = witty;
        this.mind = mind;
        this.wise = wise;
        this.creative = creative;
        this.score = magicPower + distanceTransgression + witty + mind + wise + creative;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nwitty: " + witty +
                "\nmind: " + mind +
                "\nwise: " + wise +
                "\ncreative: " + creative;
    }

    public int getScore() {
        return score;
    }
}
