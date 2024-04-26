package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//class 를 만들어 오류를 참조해 오류메세지를 더 자세하게 표현할 수 있다.
class ExceptionDemo extends ArithmeticException{
    public int first;
    public int second;
    ExceptionDemo() {
        super();
    }
    ExceptionDemo(String message){
        super(message);
    }
    ExceptionDemo(String message, int first, int second){
        super(message);
        this.first = first;
        this.second = second;
    }
}
class A{
    private int[] arr =  new int [3];
    A(){
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }
    public void z(int first, int second){
        //예외를 만들어서 getMessage()로 받을 수 있다.
        //ArithmeticException는 unchecked exception이다 예외처리를 안 해줘도 된다.
        if(second == -1){
            throw new ExceptionDemo("-1은 없습니다", first, second);
        }
        //catch는 여러가지 예외처리를 할 수 있음
        try{
            System.out.println(arr[first] / arr[second]);
        } catch(ArithmeticException e) {
            System.out.println("ArithmeticException e");
            e.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException e");
        } catch(Exception e) {
            System.out.println("Exception");
            //finally는 언제나 실행
        } finally {
            System.out.println("finally");
        }
    }
}   
class B{  // throw를 통해서 오류에 대한 정보를 넘길 수 있다.
    //IOException는 checked exception이고 반드시 예외처리를 해 줘야 한다.
    void run() throws FileNotFoundException, IOException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}
public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        try {
            b.run(); 
        }catch (FileNotFoundException e) {
            System.out.println("오류발생");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("오류발생");
            e.printStackTrace();
        }
        a.z(10,0);
        a.z(1,0);
        a.z(2,1);
        try{
            a.z(1,-1);
        } catch(ExceptionDemo e){
            System.out.println(e.getMessage());
            System.out.println(e.first);
            System.out.println(e.second);
        }
    }
}
