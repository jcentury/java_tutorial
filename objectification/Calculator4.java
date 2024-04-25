package objectification;

class CalculatorDemo4 {
    int left, right;
    // public CalculatorDemo4(값)을 만들려면 미리 기본생성자를 만듦 없을 때는 자동으로 생성
    public CalculatorDemo4(){}

    //suepr(left, right)로 받은 값을 입력
    public CalculatorDemo4(int left, int right){
        this.left = left;
        this.right = right;
    }

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

    static class SubstractionableCalculator extends CalculatorDemo4 {
        public SubstractionableCalculator(int left, int right) {
            //부모 클래스 생성자에 값을 보냄
            super(left, right);
        }
        
        public void substract() {
            System.out.println(this.left - this.right);
        }

        // 오버라이딩하면 상속받는 곳의 함수를 출력
        @Override
        public void sum() {
            System.out.println("실행결과는 " + (this.left + this.right) + "입니다.");
        }
    }
}

public class Calculator4 {
    public static void main(String[] args) {
        CalculatorDemo4.SubstractionableCalculator c1 = new CalculatorDemo4.SubstractionableCalculator(10, 20);
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}