package Ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
//        charAt으로 ssn에서 인덱스 6에 위치한 글자를 뽑아냄
        char sex = ssn.charAt(6);
        switch(sex){
//            sex가 1이나 3인 경우
//            case '1'에 break문이 없으므로 아래 조건과 같이 포함
            case '1':
            case '3':
                System.out.println("남자입니다");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다");
                break;
        }
    }
}
