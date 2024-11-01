public class Hogwarts {
    private String fullName;
    private int nobility;
    private int honor;
    private int courage;
    private int diligence;
    private int loyalty;
    private int honesty;
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int desireForPower;
    int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
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

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
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

    public int getDesireForPower() {
        return desireForPower;
    }

    public void setDesireForPower(int desireForPower) {
        this.desireForPower = desireForPower;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "fullName='" + fullName + '\'' +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                ", diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", desireForPower=" + desireForPower +
                ", score=" + score +
                '}';
    }


    public Hogwarts(String fullName, int nobility, int honor, int courage, int diligence, int loyalty, int honesty, int intelligence, int wisdom, int wit, int creativity, int cunning, int determination, int ambition, int resourcefulness, int desireForPower) {
        this.fullName = fullName;
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.desireForPower = desireForPower;
        this.score = nobility + honor + courage + diligence + loyalty + honesty + intelligence + wisdom + wit + creativity + cunning + determination + ambition + resourcefulness + desireForPower;
    }

    public String battle(Hogwarts other) {
        if (score < other.score) {
            return other.fullName + " обладает большей мощностью магии, чем " + fullName;
        } else if (score > other.score) {
            return fullName + " обладает большей мощностью магии, чем " + other.fullName;
        } else {
            return "Ничья среди: " + other.fullName + " и " + fullName;
        }
    }
}