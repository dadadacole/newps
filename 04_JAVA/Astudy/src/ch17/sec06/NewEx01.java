package ch17.sec06;

public class NewEx01 {
    public static void main(String[] args) {
        NewExSub nes = null;
        nes = new NewExSub();
        //new: 인스턴스 생성, Heap 메모리 공간 할당, 객체에게 참조값 리턴
        System.out.println(nes);
        nes.sum(0,20);



    }
}
