package sec03.exam04;

public class CarExample {
    public static void main(String[] args) {
        Car cha1 = new Car();
        System.out.println("cha1.company: " + cha1.company);
        System.out.println();

        Car cha2 = new Car("자가용");
        System.out.println("cha2.company: " + cha2.company);
        System.out.println("cha2.model: " + cha2.model);
        System.out.println();

        Car cha3 = new Car("자가용", "빨강");
        System.out.println("cha3.company: " + cha3.company);
        System.out.println("cha3.model: " + cha3.model);
        System.out.println("cha3.color: " + cha3.color);
        System.out.println();

        Car cha4 = new Car("자가용", "검정", 200);
        System.out.println("cha4.company: " + cha4.company);
        System.out.println("cha4.model: " + cha4.model);
        System.out.println("cha4.color: " + cha4.color);
        System.out.println("cha4.maxSpeed: " + cha4.maxSpeed);
    }
}
