package ch16.sec02.exam02;

public class ButtonExample {
    public static void main(String[] args) {
        //Ok 버튼 객체 생성
        Button btnOk = new Button();

        //OK 버튼 객체에 람다식 주입
        //ClickListner 내의 onClick 부분을 람다식이 채워줌
        //매개변수 없는 람다식
        btnOk.setClickListener(()->{
            System.out.println("Ok 버튼을 클릭했습니다");
        });

        //Ok 버튼 클릭하기
        btnOk.click();

        //Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        //Cancel 버튼 객체에 람다식 주입
        btnCancel.setClickListener(()->{
            System.out.println("Cancel 버튼을 클릭했습니다");
        });

        //Cancel 버튼 클릭하기
        btnCancel.click();
    }
}
