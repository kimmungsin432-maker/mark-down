package sec04.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car myJar = new Car();

        myJar.setGas(5);     //Jar의 setGas() 메소드 호출

        boolean gasState = myJar.isLeftGas(); //Jardml isLeftGas()메소드 호출
        if(gasState) {
            System.out.println("출발합니다.");
            myJar.run();  //Jar의 run() 메소드 호출
        }

        if(myJar.isLeftGas()) {
            System.out.println("gas를 주입할 필요가 없습니다.");
        } else {
            System.out.println("gas를 주입하세요.");
        }
    }
}
