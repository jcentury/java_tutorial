package objectification;

class CalculatorDemo1 {
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left + this.right);
    }

    public void avg(){
        System.out.println((this.left + this.right) / 2);
    }

//estends로 확장해서 Calcualtor1을 사용 가능함
public static class SubstractionableCalculator extends CalculatorDemo1 {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

//재상속이 가능함
public static class multiplicationableCalculator extends SubstractionableCalculator {
    public void  multiplication() {
        System.out.println(this.left * this.right);
    }
}


public class Calculator1 {
    public static void main(String[] args) {

        multiplicationableCalculator c1 = new multiplicationableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.substract();
    }
}

}
