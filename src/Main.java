public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        car.modelName = "car1";
        car2.modelName = "car2";
        car.wheelsCount = 4;
        car2.wheelsCount = 4;

        Truck truck = new Truck();
        Truck truck2 = new Truck();
        truck.modelName = "truck1";
        truck2.modelName = "truck2";
        truck.wheelsCount = 6;
        truck2.wheelsCount = 8;

        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        bicycle.modelName = "bicycle1";
        bicycle2.modelName = "bicycle2";
        bicycle.wheelsCount = 2;
        bicycle2.wheelsCount = 2;

        ServiceStation station_bicycle = new ServiceStationBicycle();
        ServiceStation station_car = new ServiceStationCar();
        ServiceStation station_truck = new ServiceStationTruck();

        station_car.check(car);
        station_car.check(car2);
        station_bicycle.check(bicycle);
        station_bicycle.check(bicycle2);
        station_truck.check(truck);
        station_truck.check(truck2);
    }
}