package sec04.exam05;

public class CarExample {
    public static void main(String[] args) {
        Car myPar = new Car();
        myPar.keyTurnOn();
        myPar.run();
        int speed = myPar.getSpeed();
        System.out.println("현재 속도: " + speed +"km/h");
    }
}
