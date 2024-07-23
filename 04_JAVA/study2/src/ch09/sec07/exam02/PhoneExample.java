package ch09.sec07.exam02;

public class PhoneExample{
    public static void main(String[] args) {
        Phone galaxy = new Phone();
        galaxy.model ="Galaxy10";
        galaxy.color ="Black";
        galaxy.price = 100;

        Phone iphone = new Phone();
        iphone.model = "Iphonex";
        iphone.color = "Yellow";
        iphone.price = 200;

        System.out.println("철수는 이번에" + galaxy.model +galaxy.color + "+색상을" +galaxy.price+"만원에 샀다");
        System.out.println("철수는 이번에" + iphone.model +iphone.color + "+색상을" +iphone.price+"만원에 샀다");

    }
}

//클래스는 붕어빵을 만들어내는 틀이라고 할수 있으며, 인스턴스는 붕어빵 틀에 의해 만들어진 붕어빵이라고 할 수 있다.
//상속은 extends로 사용한다.

//super, super() 메소드 부모 클래스로부터 상속받은 필드나 메소드 및 생성자를 자식 클래스에서 참조하여 사용하고 싶을 때 사용