import java.util.Scanner;

public class KeyControlExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int balance = 0;

        while (run) {
            System.out.println("-------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-------------");
            System.out.print("선택:");

            String strNum = scanner.nextLine();

            switch (strNum) {
                case "1":
                    System.out.print("예금액을 입력하세요: ");
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    scanner.nextLine(); // 개행 문자 제거
                    System.out.println("예금 완료. 현재 잔고는 " + balance + "원 입니다.");
                    break;
                case "2":
                    System.out.print("출금액을 입력하세요: ");
                    int withdraw = scanner.nextInt();
                    if (withdraw > balance) {
                        System.out.println("잔고가 부족합니다. 현재 잔고는 " + balance + "원 입니다.");
                    } else {
                        balance -= withdraw;
                        scanner.nextLine(); // 개행 문자 제거
                        System.out.println("출금 완료. 현재 잔고는 " + balance + "원 입니다.");
                    }
                    break;
                case "3":
                    System.out.println("현재 잔고는 " + balance + "원 입니다.");
                    break;
                case "4":
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
