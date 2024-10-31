public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    private int score;


    public Gryffindor(String fullName, int magicPower, int distanceTransgression, int nobility, int honor, int bravery) {
        super(fullName, magicPower, distanceTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.score = magicPower + distanceTransgression + honor + bravery + nobility;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nnobility: " + nobility +
                "\nhonor: " + honor +
                "\nbravery: " + bravery;
    }

    public int getScore() {
        return score;
    }

    public String battle(Gryffindor other) {
        if (getScore() < other.getScore()) {
            return other.getFullName() + " обладает большей мощностью магии, чем " + getFullName();
        } else if (getScore() > other.getScore()) {
            return getFullName() + " обладает большей мощностью магии, чем " + other.getFullName();
        } else {
            return "Ничья среди: " + other.getFullName() + " и " + getFullName();
        }
    }
}
