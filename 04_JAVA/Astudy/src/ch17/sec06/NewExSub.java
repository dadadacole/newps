package ch17.sec06;

class NewExSub {
    public void sum(int a, int b){ // int a=0, int b=20;
        int sum=0, odd=0, even=0; // 초기값 설정
        for(int i=a; i<=b; i++){
            sum += i; // 총합 합계
            if(i%2==0){
                even += i; // 짝수합
            }else{
                odd += i; // 홀수합
            }
        }
        System.out.println(a+"~"+b+"까지의 합:"+sum);
        System.out.println(a+"~"+b+"까지의 짝수합:"+even);
        System.out.println(a+"~"+b+"까지의 홀수합:"+odd);
    }
}
