public class Hufflepuff extends Hogwarts {
    public Hufflepuff(String fullName, int nobility, int honor, int courage, int diligence, int loyalty, int honesty, int intelligence, int wisdom, int wit, int creativity, int cunning, int determination, int ambition, int resourcefulness, int desireForPower) {
        super(fullName, nobility, honor, courage, diligence, loyalty, honesty, intelligence, wisdom, wit, creativity, cunning, determination, ambition, resourcefulness, desireForPower);
        this.score = nobility + honor + courage + diligence + loyalty + honesty + intelligence + wisdom + wit + creativity + cunning + determination + ambition + resourcefulness + desireForPower;
    }

    @Override
    public String toString() {
        return "Ученик Hufflepuff: " + super.toString();
    }

    public String whoIsBetter(Hufflepuff other) {
        int myScore = getDiligence() + getLoyalty() + getHonesty();
        int otherScore = other.getDiligence() + other.getLoyalty() + other.getHonesty();

        if (myScore > otherScore) {
            return getFullName() + " побеждает с счетом " + myScore;
        } else if (myScore < otherScore) {
            return other.getFullName() + " побеждает с счетом " + otherScore;
        } else {
            return "Ничья :) счет " + myScore;
        }
    }
}