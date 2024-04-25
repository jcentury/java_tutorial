package modifier;
class A{
    public String y() {
        return " public void y()";
    }
    //private는 같은 클래스 안에서는 사용가능하지만 외부에서 직접적으로 호출은 불가능하다
    private String z() {
        return " public void z()";
    }
    public String x() {
        return z();
    }
}

public class AccessDemo1 {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        // 오류발생
        // System.out.println(a.z());
        System.out.println(a.x());

    }
}
