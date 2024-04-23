package numberstring;

public class Number {

    public static void main(String[]args){
        //더하기
        System.out.println(1+2);
        //빼기
        System.out.println(2-1);
        //실수
        System.out.println(1.2+1.3);
        //곱하기
        System.out.println(2*5);
        //나누기
        System.out.println(6/2);
        //나머지
        System.out.println(5%2);

        int a = 10;
        int b = 3;
        float c = 10.0F;
        float d = 3.0F;

        //둘다 정수 정수 출렬
        System.out.println(a/b);
        //둘다 실수 실수 출력
        System.out.println(c/d);
        //d 만 실수 a형변환으로 실수로 출력
        System.out.println(a/d);

        int i = 3;
        //실행후 더하기
        System.out.println(i++);
        System.out.println(i);
        //실행 전 더하기
        System.out.println(++i);

        //같으면 true
        System.out.println(1==1);
        //다르면 true
        System.out.println(1!=2);
        System.out.println(1==1);

        String n = "hello world";
        String m = new String("hello world");
        System.out.println(n==m);
        //문자열 비교 메소드
        System.out.println(n.equals(m));

    }
    
}
