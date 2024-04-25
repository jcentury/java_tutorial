package objectification;

class CalculatorDemo4 {
    int left, right;
    int third = 0;
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

    //오버로딩은 같은 이름 다른 매개변수로 활용할 떄 사용한다.
    //변수의 이름만 바꿔서는 안된다 예  public void setOprands(int one, int two)
    public void setOprands(int left, int right, int third){
        this.left = left;
        this.right = right;
        this.third = third;
    }

    public void sum(){
        System.out.println(this.left + this.right + this.third);
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
        // 오버라이딩을 하려면 부모의 return 데이터 타입, 이름이 일치해야 한다 예(int는 안된다.)
        // 같은 내용을 입력하기 위해서는 super.sum()을 사용 
        @Override
        public void sum() {
            System.out.println("실행결과는 " + (this.left + this.right + this.third) + "입니다.");
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
        c1.setOprands(10, 20, 30);
        c1.sum();
    }
}