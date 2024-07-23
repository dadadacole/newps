package ch06.sec08;

public class CalculatorExample {
    public static void main(String[] args) {

        Calculator myCalc = new Calculator();

        myCalc.PowerOn();

//        int result1 = myCalc.plus(2,4);
//        System.out.println(("result1:" + result1));
//
//        int x = 10;
//        int y = 5;
//
//        double result2 = myCalc.divide(x,y);
//        System.out.println("result2:" + result2);

        //리턴값이 없는 powerOff() 메소드 호출
        myCalc.powerOff();
    }
}