package ch02;

public class FloatDoubleExample {
    public static void main(String[] args) {
        float var1 = 0.123456789f;
        double var2 = 0.123456789;
        System.out.println("var1:" + var1);
        System.out.println("var2:" + var2);

        //10의 거듭제곱 리터럴
        double var3 = 3e6;
        float var4 = 3e6F;
        double var5 = 2e-3;
        System.out.println("var3:" + var3);
        System.out.println("var4:" + var4);
        System.out.println("var4: " +var5);
    }
}
