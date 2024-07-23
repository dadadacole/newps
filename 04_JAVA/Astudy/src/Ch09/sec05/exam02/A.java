package Ch09.sec05.exam02;

public class A {
    String field = "A-field";

    //A 인스턴스 메소드
    void method(){
        System.out.println("A-method");
    }

    class B{
        //B 인스턴스 필드
        String field = "B-field";
    //인스턴스 멤버 메소드
    void method(){
        System.out.println("B-method");
    }

    //B 인스턴스 메소드
    void print(){
        //B 객체의 필드와 메소드 사용
        System.out.println(this.field);
        this.method();

        //A 객체의 필드와 메소드 사용
        System.out.println(A.this.field);
        A.this.method();
        }
    }

    //A의 인스턴스 메소드
    void useB(){
        B b = new B();
        b.print();
    }
}

