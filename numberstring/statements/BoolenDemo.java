package numberstring.statements;

public class BoolenDemo {

    public static void main(String[]args){
        //and연산자는 true만 있을 때 출력
        if (true && true) {
            System.out.println(1);
        }
        if (true && false) {
            System.out.println(2);
        }
        if (false && true) {
            System.out.println(3);
        }
        if (false && false) {
            System.out.println(4);
        }
        //or 연산자는 true가 하나라도 있다면 출력
        if (true || true) {
            System.out.println(1);
        }
        if (true || false) {
            System.out.println(2);
        }
        if (false || true) {
            System.out.println(3);
        }
        if (false || false) {
            System.out.println(4);
        }
        //not 연산자는 true는 false로 fasle는 true로 변함
        if (!true) {
            System.out.println(1);
        }
        if (!false) {
            System.out.println(2);
        }
    }
    
}
