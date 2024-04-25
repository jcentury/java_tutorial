package objectification;

class CalculatorDemo2 {
    static double PI = 3.14;
    //클래스 변수 base 생성
    static int base = 0;
    int legt, right;

    public void setOprands(int legt, int right){
        this.legt = legt;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.legt + this.right + base);
    }

    public void avg(){
        System.out.println((this.legt + this.right + base) / 2);
    }

public class Calculator2 {
    public static void main(String[] args) {

        CalculatorDemo2 c1 = new CalculatorDemo2();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();

        CalculatorDemo2 c2 = new CalculatorDemo2();
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();

        //class 변수의 값을 변경해서 값 변경
        CalculatorDemo2.base= 10;
        c1.sum();
        c2.sum();
    }
}
}
