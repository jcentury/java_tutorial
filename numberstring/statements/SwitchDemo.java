package numberstring.statements;

public class SwitchDemo {
    public static void main(String[]args){
        System.out.println("switch(1)");
        switch(1){
            case 1:
            System.out.println("one");
            //switch문에서는 break 필수
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("three");
            break;
            //case에 없는 답을 받으면 default 값 출력
            default:
            System.out.println("default");
        }
        System.out.println("switch(2)");
        switch(2){
            case 1:
            System.out.println("one");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("three");
            break;
            default:
            System.out.println("default");
        }
        System.out.println("switch(3)");
        switch(3){
            case 1:
            System.out.println("one");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("three");
            break;
            default:
            System.out.println("default");
        }
        System.out.println("switch(4)");
        switch(4){
            case 1:
            System.out.println("one");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("three");
            break;
            default:
            System.out.println("default");
        }
    }
}
