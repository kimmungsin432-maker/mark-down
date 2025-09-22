package sec05.exam03;

public class Car {
    int speed;

    void run () {
        System.out.println(speed + "으로 달립니다.");
    }

    public static void main(String[] args) {
        Car myNar = new Car();
        myNar.speed = 60;
        myNar.run();
    }
}
