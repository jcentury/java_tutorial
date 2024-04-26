package polymorphism;

interface I1 {
    public String A();
}

interface I2 {
    public String B();
}

class D implements I1, I2{
    public String A(){
        return "A";
    };
    public String B(){
        return "B";
    };
}

public class PolymorphismDemo2 {
    public static void main(String[] args) {
        D obj = new D();
        //클래스를 사용할 때 특정한 인터페이스를 사용하고 싶다면 그 인터페이스를 지정
        I1 obj2 = new D();
        I2 obj3 = new D();

        obj.A();
        obj.B();

        obj2.A();
        //obj2.B();

        //obj3.A();
        obj3.B();
    }
}
