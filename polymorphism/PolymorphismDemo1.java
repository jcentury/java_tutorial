package polymorphism;

class A{
    public String x(){return "A.x";}
}
class B extends A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}
class B2 extends A{
    public String x(){return "B2.x";}
}

public class PolymorphismDemo1 {
    public static void main(String[] args) {
        //obj 안에 B함수를 담았지만 A함수 행새하는 상태
        A obj = new B();
        A obj2 = new B2();
        //인스턴스한 함수에 오버라이딩한 함수가 있다면 안스턴스한 클래스의 함수를 출력 예(B.x)
        System.out.println(obj.x());
        System.out.println(obj2.x());
    }
}
