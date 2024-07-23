package ch07.sec10.exam03;

import java.awt.event.ActionListener;

public class ButtonExample {
    public static void main(String[] args) {
        //OK 버튼 객체 생성
        Button btnOk = new Button();

        //Ok 버튼 클릭 이벤트를 처리할 ClickListner 구현 클래스(로컬 클래스)
        class OkListener implements Button.ClickListner {
            @Override
            public void onClick(){
                System.out.println("Ok 버튼을 클릭했습니다");
            }
        }

        //Ok 버튼 객체에 CLICKLISTNER 구현 객체 주입
        btnOk.setClickListner(new OkListener());

        //Ok 버튼 클릭하기
        btnOk.click();
        //-------------------------------------------------------------------------------------

        //cancel 버튼 객체 생성
        Button btnCancel = new Button();

        //Cancel 버튼 클릭 이벤트를 처리할 ClickListner 구현 클래스
        class CancelListener implements Button.ClickListner {
            @Override
            public void onClick(){
                System.out.println("Cancel 버튼을 클릭했습니다");
            }
        }

        //Cancel 버튼 객체에 ClickListner 구현 객체 주입
        btnCancel.setClickListner(new CancelListener());

        //Cancel 버튼 클릭하기
        btnCancel.click();
    }
}
