package abstractexample;

//abstract 는 상속을 강제함 
abstract class A {
    public abstract int b();
    //본체가 있는 메소드는  abstract 키워드를 가질 수 없다
    //예 public abstract int c(){System.out.println("world");}
    //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.
    public void d() {
        System.out.println("world");
    }
}

//구체적인 내용을 오버라이딩 해줘야 함
//사용자가 필요에 따라서 작성
class B extends A {
    @Override
    public int b(){
        return 1;
    }

}

public class AbstractDemo {
    public static void main(String[] args) {
        B obj = new B();
    }
}
