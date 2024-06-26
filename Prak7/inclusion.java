public class inclusion {
    public static class Vehicle {
        public void calRent(int distance, float price) {
            float fare = distance * price;
            System.out.println("Vehicle price: " + fare);
        }
    }

    public static class Car extends Vehicle {
        public void calRent(int distance, float price) {
            float fare = distance * price;
            fare = fare - 100.00f;
            System.out.println("Rent price: " + fare);
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.calRent(50, 1000);
        car.calRent(50, 1000);
    }
}