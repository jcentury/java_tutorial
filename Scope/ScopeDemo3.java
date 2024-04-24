package Scope;

class C {
    int v = 10;

    void m () {
        int v = 20;
        //에서 사용된 v 값을 출력
        System.out.println(v);
        //this 를 사용해서 전역변수를 사용
        System.out.println(this.v);
    }
}

public class ScopeDemo3 {
    public static void main(String[] args) {

        C c1 = new C();
        c1.m();

    }
    
}
