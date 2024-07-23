package Ch09.sec06.exam01;

public class Button {
    //정적 중첩 인터페이스
    public static interface ClickListener {
        //추상 메소드
        void onClick();}

        //필드
        private ClickListener clickListner;

        //메소드
        public void setClickListener(ClickListener clickListner) {
            this.clickListner = clickListner;
        }


        public void click(){
            this.clickListner.onClick();
        }
    }

