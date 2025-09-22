package sec02.exam05;

public class CharOperationExample {
    public static void main(String[] args) {
        char c1 = 'A' + 1;         //<----------char c1 =66;컴파일됌
        char c2 = 'A';
        //char c3 = c2 + c1;      <---------char변수가 산술연산에서 사용되면int타입으로 변환되므로 염살 결과는 int타입이됨
        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);
        //System.out.println("c3:" + c3);
    }
}
