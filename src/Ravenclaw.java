public class Ravenclaw extends Hogwarts {
    public Ravenclaw(String fullName, int nobility, int honor, int courage, int diligence, int loyalty, int honesty, int intelligence, int wisdom, int wit, int creativity, int cunning, int determination, int ambition, int resourcefulness, int desireForPower) {
        super(fullName, nobility, honor, courage, diligence, loyalty, honesty, intelligence, wisdom, wit, creativity, cunning, determination, ambition, resourcefulness, desireForPower);
        this.score = nobility + honor + courage + diligence + loyalty + honesty + intelligence + wisdom + wit + creativity + cunning + determination + ambition + resourcefulness + desireForPower;
    }

    @Override
    public String toString() {
        return "Ученик Ravenclaw: " + super.toString();
    }

    public String whoIsBetter(Ravenclaw other) {
        int myScore = getIntelligence() + getWisdom() + getWit() + getCreativity();
        int otherScore = other.getIntelligence() + other.getWisdom() + other.getWit() + other.getCreativity();

        if (myScore > otherScore) {
            return getFullName() + " побеждает с счетом " + myScore;
        } else if (myScore < otherScore) {
            return other.getFullName() + " побеждает с счетом " + otherScore;
        } else {
            return "Ничья :) счет " + myScore;
        }
    }
}