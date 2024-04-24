package objectification;

public class C1 {
    static int static_variable = 1;
    int instance_variable = 2;

    static void static_static(){
        System.out.println(static_variable);
    }

    static void static_instance(){
        // 클래스 메소드에서는 인스턴스 변수에 접근 불가
        // System.out.println(instance_variable);
    }

    void instance_static(){
        //인스턴스 메소드에서는 클래스 변수에 접근 가능
        System.out.println(static_variable);
    }

    void instance_instance(){
        System.out.println(instance_variable);
    }

public class ClassMemberDemo {
    public static void main(String[] args) {

    }

}
}
