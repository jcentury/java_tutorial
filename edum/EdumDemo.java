package edum;

// class Fruit{
//     public static final Fruit APPLE = new Fruit();
//     public static final Fruit PEACH = new Fruit();
//     public static final Fruit BANANA = new Fruit();
// }

//위의 Fruit 클래스와 같은 의미이다 열거를 위한 코드 상수로서의 기능뿐 아니라 값을 갖게 할 수 있다
//생성자 와 인스턴스화 불가능
enum Fruit{
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    public String getColor(){
        return this.color;
    }
    Fruit(String color){
        this.color = color;
    }
}

public class EdumDemo {
    public static void main(String[] args) {

        //값을 배열처럼 사용 가능
        for(Fruit f: Fruit.values()){
            System.out.println(f);
        }
        //enum 사용
        Fruit type = Fruit.APPLE;
        switch (type) {
            case APPLE:
                System.out.println(57 + "kcal" + Fruit.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(34 + "kcal" + Fruit.PEACH.getColor());
            break;
            case BANANA:
                System.out.println(93 + "kcal" + Fruit.BANANA.getColor());
            break;
            default:
                break;
        }
        //enum 미사용
        // Fruit type = Fruit.APPLE;
        // switch (type) {
        //     case Fruit.APPLE:
        //         System.out.println(57 + "kcal");
        //         break;
        //     case FruitPEACH:
        //         System.out.println(34 + "kcal");
        //     break;
        //     case FruitBANANA:
        //         System.out.println(93 + "kcal");
        //     break;
        //     default:
        //         break;
        // }
    }
}
