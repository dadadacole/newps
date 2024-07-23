package ch07.sec10.exam03;

public class Button {
    //정적 중첩 인터페이스
    public static interface ClickListner{
    //추상 메소드
    void onClick();
    }

    //필드
    private ClickListner clickListner;


    //메소드
    public void setClickListner(ClickListner clickListner){
    this.clickListner = clickListner;
    }

    public void click(){
        this.clickListner.onClick();
     }
    }

