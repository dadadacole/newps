package ch07.sec09;

public class InstanceofExample {
    public static void personInfo(Person person) {
        System.out.println("name:" + person.name);
        person.walk();

        //person이 참조하는 객체가 Student 타입일 경우
        // student 변수에 대입(타입 변환 발생)

        if(person instanceof Student student){
            System.out.println("studentNo:" + student.studentNo);
            student.study();
        }
    }

    public static void main(String[] args) {

        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }
}
