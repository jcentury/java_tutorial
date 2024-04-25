package objectification;

class SubstractionableCalculator extends CalculatorDemo4 {
    public SubstractionableCalculator(int left, int right) {
        super(left, right);
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class Calculator4 {
    public static void main(String[] args) {

        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
