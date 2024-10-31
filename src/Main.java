//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 8, 9, 10, 5, 15);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 9, 10, 8, 6, 8);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 7, 8, 9, 5, 8);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 5, 6, 6, 8, 9);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 8, 9, 10, 7, 8);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch Fletchley", 6, 7, 5, 9, 7);

        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", 7, 8, 6, 5, 6, 5);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 7, 6, 5, 6, 7, 6);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 6, 7, 5, 5, 6, 5);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 2, 3, 4, 4, 3, 4, 6); //26
        Slytherin grahamMontague = new Slytherin("Graham Montague", 2, 3, 3, 5, 4, 4, 5);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 1, 2, 3, 4, 3, 3, 4);
        System.out.println("dracoMalfoy.battle(gregoryGoyle) = " + dracoMalfoy.battle(gregoryGoyle));

    }
}