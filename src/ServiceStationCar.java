public class ServiceStationCar implements ServiceStation {

    @Override
    public void check(Bicycle bicycle) {
        System.out.println("Этот сервсис не может чинить этот вид транспорта");
    }

    @Override
    public void check(Car car) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.modelName);
            for (int i = 0; i < car.wheelsCount; i++) {
                car.updateTyre();
            }
            car.checkEngine();
        }
    }

    @Override
    public void check (Truck truck){
        System.out.println("Этот сервсис не может чинить этот вид транспорта");
    }
}
