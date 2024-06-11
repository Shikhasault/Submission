interface Interface1 {
    void updateGear();
}

interface Interface2 {
    void accelerate();
}

interface Interface3 {
    void pushBrake();
}

 class Car implements Interface1, Interface2, Interface3 {
    private int gear;
    private int speed;
    private int brake;

    public Car(int gear, int speed, int brake) {
        this.gear = gear;
        this.speed = speed;
        this.brake = brake;
    }

    @Override
    public void updateGear() {
        // Update the value of gear.
    }

    @Override
    public void accelerate() {
        // Update the value of speed.
    }

    @Override
    public void pushBrake() {
        // Update the value of brake.
    }

    public int currentSpeed() {
        return speed - brake;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBrake() {
        return brake;
    }
}

class Truck implements Interface1, Interface2, Interface3 {
    private int gear;
    private int speed;
    private int brake;

    public Truck(int gear, int speed, int brake) {
        this.gear = gear;
        this.speed = speed;
        this.brake = brake;
    }

    @Override
    public void updateGear() {
        // Update the value of gear.
    }

    @Override
    public void accelerate() {
    }

    @Override
    public void pushBrake() {
        // Update the value of brake.
    }

    public int currentSpeed() {
        return speed - brake;
        //The current speed will be given after subtracting the value of speed and brake.
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBrake() {
        return brake;
    }
}
public class lab3q1 {
    public static void main(String[] args) {
        // Create Car object
        Car c1 = new Car(2, 4, 3);
        c1.updateGear();
        c1.accelerate();
        c1.pushBrake();
        System.out.println("The current state of  Car is: ");
        System.out.println("Car: Gear: " + c1.getGear() + ", Current Speed: " + c1.currentSpeed() + ", Brake: " + c1.getBrake());

        // Create Truck object
        Truck t1 = new Truck(5, 2, 1);
        t1.updateGear();
        t1.accelerate();
        t1.pushBrake();
        System.out.println("The current state of Truck is: ");
        System.out.println("Truck: Gear: " + t1.getGear() + ", Current Speed: " + t1.currentSpeed() + ", Brake: " + t1.getBrake());
    }
}