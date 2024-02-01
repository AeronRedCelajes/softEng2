public class CarTest{
    public static void main(String[] args ){

        Car myCar = new Car.CarBuilder()
            .color("Red")
            .passengerCapacity(6)
            .engineType("Diesel")
            .transmission("Automatic")
            .brand("Honda")
            .build();

        // Display the car information
        System.out.println("Car Information Details: ");
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Engine Type: " + myCar.engineType);
        System.out.println("Transmission: " + myCar.transmission);
        System.out.println("Color: " + myCar.color);
        System.out.println("Passenger Capacity: " + myCar.passengerCapacity);
    }
}