public class Hogwarts {
    private final String fullName;
    private int magicPower;
    private int distanceTransgression;

    public Hogwarts(String fullName, int magicPower, int distanceTransgression) {
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.distanceTransgression = distanceTransgression;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        this.distanceTransgression = distanceTransgression;
    }

    public String getFullName() {
        return fullName;
    }

    public int getScore() {
        return 0;
    }

    @Override
    public String toString() {
        return "fullName='" + fullName +
                "\nmagicPower=" + magicPower +
                "\ndistanceTransgression=" + distanceTransgression;
    }

    public String battle(Hogwarts other) {
        if (getScore() < other.getScore()) {
            return other.fullName + " обладает большей мощностью магии, чем " + fullName;
        } else if (getScore() > other.getScore()) {
            return fullName + " обладает большей мощностью магии, чем " + other.fullName;
        } else {
            return "Ничья среди: " + other.fullName + " и " + fullName;
        }
    }
}
