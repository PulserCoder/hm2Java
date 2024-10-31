public class ServiceStationTruck implements ServiceStation{
    @Override
    public void check(Bicycle bicycle) {
        System.out.println("Этот сервсис не может чинить этот вид транспорта");
    }

    @Override
    public void check(Car car) {
        System.out.println("Этот сервсис не может чинить этот вид транспорта");
    }

    @Override
    public void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем " + truck.modelName);
            for (int i = 0; i < truck.wheelsCount; i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        }
    }
}
