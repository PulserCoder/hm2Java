public class ServiceStationBicycle implements ServiceStation {
    @Override
    public void check(Bicycle bicycle) {
         if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.modelName);
            for (int i = 0; i < bicycle.wheelsCount; i++) {
                bicycle.updateTyre();
            }
        }
    }

    @Override
    public void check(Car car) {
        System.out.println("Этот сервсис не может чинить этот вид транспорта");
    }

    @Override
    public void check(Truck truck) {
        System.out.println("Этот сервсис не может чинить этот вид транспорта");
    }
}