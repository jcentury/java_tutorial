package objectification;
//class 생성
class Calculatorexample {
    //final을 사용하여 사용자가 값을 변경하지 못하게 함
    static final double PI = 3.14;
    int left, right;

    public void setOprands(int left, int right){
        //this.은 전역변수임,Calculator에서 생성된 변수
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left + this.right);
    }

    public void avg(){
        System.out.println((this.left + this.right) / 2);
    }
}

public class Calculator {
    public static void main(String[] args) {

        //new Calculator()는 인스턴스를 생성
        //Calculator는 데이터 타입을 의미
        Calculatorexample c1 = new Calculatorexample();
        //setOprands를 통해서 값을 입력
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();

        Calculatorexample c2 = new Calculatorexample();
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();

        //인스턴스를 통해 접근
        System.out.println(c1.PI);

        System.out.println(c2.PI);
        //클래스를 통해서 접근
        System.out.println(Calculatorexample.PI);
    }
}
