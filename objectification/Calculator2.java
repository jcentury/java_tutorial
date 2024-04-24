package objectification;

public class Calculator2 {
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

public class CalculatorDemo2 {
    public static void main(String[] args) {

        Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();

        Calculator2 c2 = new Calculator2();
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();

        Calculator2.base= 10;
        c1.sum();
        c2.sum();
    }
}
}
