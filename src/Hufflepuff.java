public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;
    private int score;

    public Hufflepuff(String fullName, int magicPower, int distanceTransgression, int industriousness, int loyalty, int honesty) {
        super(fullName, magicPower, distanceTransgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
        this.score = magicPower + distanceTransgression + loyalty + honesty + industriousness;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nindustriousness: " + industriousness +
                "\nloyalty: " + loyalty +
                "\nhonesty: " + honesty;
    }

    public int getScore() {
        return score;
    }

}
