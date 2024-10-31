public class Truck extends Car {

    public String modelName;
    public int wheelsCount;

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void check() {
        super.check();
        checkTrailer();
    }
}