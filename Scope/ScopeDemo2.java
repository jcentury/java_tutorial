package Scope;

public class ScopeDemo2 {
    //전역변수
    static int i;

    static void a() {
        i = 0;
    }
    
    public static void main(String[] args) {
        //전역변수 i 를 할당 받음
        //int를 넣으면 정상적으로 작동
        for (i = 0; i < 5; i++){
            a();
            System.out.println(i);
        }
}
}