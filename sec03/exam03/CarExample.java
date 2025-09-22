package sec03.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car kar1 = new Car();
        System.out.println("kar1.company :" + kar1.company);
        System.out.println();

        Car kar2 = new Car("자가용");
        System.out.println("kar2.company :" + kar2.company);
        System.out.println("kar2.model :" + kar2.model);
        System.out.println();

        Car kar3 = new Car("자가용", "빨강");
        System.out.println("kar3.company :" + kar3.company);
        System.out.println("kar3.model :" + kar3.model);
        System.out.println("kar3.color :" + kar3.color);
        System.out.println();

        Car kar4 = new Car("택시", "검정", 200);
        System.out.println("kar4.company :" + kar4.company);
        System.out.println("kar4.model :" + kar4.model);
        System.out.println("kar4.color :" + kar4.color);
        System.out.println("kar4.maxSpeed:" + kar4.maxSpeed);
    }
}
