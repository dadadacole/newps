package ch06.sec08.exam04;



public class practiceExample {
    public static void main(String[] args) {

        practice myCalc = new practice();

        myCalc.PowerOn();

        System.out.println("데이터베이스:" +myCalc.model);

        //리턴값이 없는 powerOff() 메소드 호출
        myCalc.powerOff();
    }
}