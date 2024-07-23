package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        //인터페이스를 통해서 호출
        vehicle.run();

        //강제 타입 변환 후 호출
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
