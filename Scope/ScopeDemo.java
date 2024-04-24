package Scope;

public class ScopeDemo {

    static void a() {
        // 이i 는 a 메소드 안에서만 유효함
        int i = 0;
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            a();
            System.out.println(i);
        }
}
}
