package variables;

public class NumberDemo {
    
    public static void main(String[]args){
        //정수형 변수 선언
        int a;
        // a에 1 입력
        a = 1;
        System.out.println(a+1);
        // a에 2 입력
        a = 2;
        System.out.println(a+1);

        //실수형 변수 선언
        double b;
        // a에 1 입력
        b = 1.1;
        System.out.println(b+1.1);

        //자동형 변환 불가 오류 발생
        // float c = 100.0;
        // int d = 100.0F;

        //데이터 타입을 명시해서 명시적 형 변환을 함
        float c = (float)100.0;
        int d = (int)100.0F;

        System.out.println(c);
        System.out.println(d);
    }

}