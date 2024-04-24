package objectification;
//class 생성
public class Calculator {
    static double PI = 3.14;
    int legt, right;

    public void setOprands(int legt, int right){
        //this.은 전역변수임,Calculator에서 생성된 변수
        this.legt = legt;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.legt + this.right);
    }

    public void avg(){
        System.out.println((this.legt + this.right) / 2);
    }

public class CalculatorDemo {
    public static void main(String[] args) {

        //new Calculator()는 인스턴스를 생성
        //Calculator는 데이터 타입을 의미
        Calculator c1 = new Calculator();
        //setOprands를 통해서 값을 입력
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();

        //인스턴스를 통해 접근
        System.out.println(c1.PI);

        System.out.println(c2.PI);
        //클래스를 통해서 접근
        System.out.println(Calculator.PI);
    }
}

}
