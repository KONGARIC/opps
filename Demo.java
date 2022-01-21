class Bicycle {

    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;

    void changeCadence(int cadence) {
        this.cadence = cadence;
    }

    void changeGear(int gear) {
        this.gear = gear;
    }

    void speedUp(int i) {
        speed = speed + i;
    }

    void applyBrakes(int d) {
        speed = speed - d;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}

public class Demo {
    public static void main(String[] args) {

        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}
