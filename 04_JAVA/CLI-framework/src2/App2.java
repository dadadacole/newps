//import java.util.Scanner;
//
//public class App2 {
//    public static void main(String[] args) {
//        boolean run = true;
//        int studentNum = 0;
//        int[] scores = null;
//
//        Scanner scanner = new Scanner(System.in);
//
////        printMenu : 메뉴 출력하는 메소드
//
//        public void printMenu(){
//            System.out.println("--------------------------------");
//            System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
//            System.out.println("--------------------------------");
//        }
//
//        public int getSelect(){
//            System.out.println("선택>");
//            return Integer.parseInt(scanner.nextLine());
//        }
//
//        private void analize(){
//            int max =0;
//            int sum =0;
//            double avg =0;
//            for(int i=0; i< scores.length;i++){
//                max = (max<scores[i])? scores[i] : max;
//                sum += scores[i];
//            }
//            avg = (double) sum / studentNum;
//            System.out.println("최고 점수:" + max);
//            System.out.println("평균 점수:" + avg);
//        }
//
//        public void getStudentNum(){
//            System.out.println("학생수>");
//            studentNum = Integer.parseInt(scanner.nextLine());
//            scores = new int[studentNum];
//        }
//
//        public void getScores(){
//            for(int i=0; i< scores.length; i++){
//                System.out.print("scores[" + i + "] >");
//                scores[i]=Integer.parseInt(scanner.nextLine());
//            }
//        }
//
//        public void printScore(){
//            for(int i=0; i< scores.length; i++){
//                System.out.println("scores[" + i + "]:" + scores[i]);
//            }
//        }
//
//        public void exit(){
//            run = false;
//        }
//
//        public void executeCommand(int selectNo){
//            if(selectNo == 1){
//                getStudentNum();
//            } else if(selectNo == 2){
//                getScores();
//            } else if(selectNo == 3){
//                printScore();
//            } else if(selectNo == 4){
//                analize();
//            } else if(selectNo == 5){
//                exit();
//            }
//        }
//
//        public void run(){
//            while(run){
//                printMenu();
//                int selectNo = getSelect();
//
//            }
//        }
//
//        //무한루프
//        while(run){
//            System.out.println("--------------------------------");
//            System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
//            System.out.println("--------------------------------");
//            System.out.println("선택>");
//            int selectNo = Integer.parseInt(scanner.nextLine());
//            if(selectNo == 1){
//                System.out.println("학생수>");
//                studentNum = Integer.parseInt(scanner.nextLine());
//                scores = new int[studentNum];
//            } else if(selectNo == 2){
//                for(int i = 0; i <scores.length; i++){
//                    System.out.println("scores[" + i + "]>");
//                    scores[i] = Integer.parseInt(scanner.nextLine());
//                }
//            } else if(selectNo == 3){
//                for(int i = 0; i <scores.length; i++){
//                    System.out.println("scores[" + i + "]:" + scores[i]);
//                }
//            }
//            else if(selectNo == 4){
//                int max =0;
//                int sum =0;
//                double avg = 0;
//                for(int i=0; i < studentNum; i++){
//                    max =(max<scores[i])? scores[i] : max;
//                    sum += scores[i];
//                }
//                avg = (double) sum/studentNum;
//                System.out.println("최고 점수:" + max);
//                System.out.println("평균 점수:" + avg);
//            }else if(selectNo == 5){
//                run = false;
//            }
//        }
//        System.out.println("프로그램 종료");
//    }
//
//    private static void getStudentNum() {
//    }
//}
