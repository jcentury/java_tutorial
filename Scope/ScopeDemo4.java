package Scope;

public class ScopeDemo4 {
    static void a(){
        String title = "coding everybody";
    }

    public static void main(String[] args) {
        a();
        //main 함수에 title이 없기 때문에 오류
        // System.out.println(title);
}
    
}
