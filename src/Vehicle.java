class Vehicle {
    String brand;
    String fuelType;
    int seats;
    String type;

    void drive() {
        System.out.println("The vehicle is moving");
    }
}

    class Car extends Vehicle{

@Override
    void drive(){
        System.out.println("The car is driving on the road");
    }
}

    class Bike extends Vehicle{

@Override
        void drive(){
            System.out.println("The bike is speeding on the road");
        }
}


class Main{
    public static void main(String[] args){
        Car Toyota = new Car();
        Toyota.brand = "Toyota";
        Toyota.fuelType = "Petrol";
        Toyota.seats = 4;

        System.out.println("Vehicle brand: " + Toyota.brand);
        System.out.println("Car has " + Toyota.seats + " seats");
                Toyota.drive();

        Bike Yamaha = new Bike();
        Yamaha.brand = "Yamaha";
        Yamaha.type = "Sports";
        Yamaha.seats = 2;

        System.out.println("Vehicle brand: " + Yamaha.brand);
        System.out.println("Bike has " + Yamaha.seats + " seats");
        System.out.println("Bike type: " + Yamaha.type);
                Yamaha.drive();
    }
}
