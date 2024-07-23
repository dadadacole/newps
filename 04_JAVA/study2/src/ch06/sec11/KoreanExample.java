package ch06.sec11;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("1213455-123455","감자바");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        //비 final 필드는 값 변경 가능
        k1.name ="김자바";
    }
}
