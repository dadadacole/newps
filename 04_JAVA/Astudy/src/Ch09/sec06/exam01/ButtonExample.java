package Ch09.sec06.exam01;

import java.awt.event.ActionListener;

public class ButtonExample {
    public static void main(String[] args) {
        //OK 버튼 객체 생성
        Button btnOk = new Button();

        //OK 버튼 클릭 이벤트를 처리할
        class OkListener implements Button.ClickListener{

            @Override
            public void onClick(){
                System.out.println("Ok 버튼을 클릭했습니다");
            }
        }

        //OK 버튼 객체에 ClickListner 구현 객체 주입
        btnOk.setClickListener(new OkListener());

        //Ok 버튼 클릭하기
        btnOk.click();

        //---------------------------------------------------------------------------

        //Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        //Cancel 버튼 클릭 이벤트를 처리할 ClickListne 구현 클래스
        class CancelListener implements Button.ClickListener{
            @Override
            public void onClick(){
                System.out.println("Cancel 버튼을 클릭했습니다");
            }
        }

        //Cancel 버튼 객체에 ClickListner 구현 객체 주입
        btnCancel.setClickListener(new CancelListener());

        //Cancel 버튼 클릭하가
        btnCancel.click();
    }
}
