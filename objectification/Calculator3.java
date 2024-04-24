package objectification;

public class Calculator3 {

    //static을 달면 클래스 메소드가 된다. 직접 접근 가능
    public static void sum(int left, int right){
        System.out.println(left + right);
    }

    public static void avg(int left, int right){
        System.out.println((left + right) / 2);
    }

public class CalculatorDemo3 {
    public static void main(String[] args) {

        //클래스에 직접 접근
        Calculator3.sum(10, 20);
        Calculator3.avg(10, 20);

        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
    }
}
    
}
