public class Car extends Bicycle {

    public String modelName;
    public int wheelsCount;


    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void check() {
        super.check();
        checkEngine();
    }
}