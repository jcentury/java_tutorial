package statements;
import java.util.Scanner;

public class LoginDemo {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("입력하세요");
		String id = sc.next();
        //egoing 이면 right 아니면 wrong 출력
        if(id.equals("egoing")){
            System.out.println("right");
        } else {
            System.out.println("wromg");
        }
    }
}
