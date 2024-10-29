public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;
    private int score;

    public Slytherin(String fullName, int magicPower, int distanceTransgression, int trick, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(fullName, magicPower, distanceTransgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
        this.score = magicPower + distanceTransgression + ambition + resourcefulness + thirstForPower + determination + trick;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ntrick: " + trick +
                "\ndetermination: " + determination +
                "\nambition: " + ambition +
                "\nresourcefulness: " + resourcefulness +
                "\nthirstForPower: " + thirstForPower;
    }

    public int getScore() {
        return score;
    }
}
