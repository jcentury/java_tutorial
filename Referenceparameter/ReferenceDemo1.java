package Referenceparameter;

public class ReferenceDemo1 {
 
    public static void runValue(){
        //복제 예 
        int a = 1;
        //값을 복재햐서 b에 입력
        int b = a;
        b = 2;
        System.out.println("runValue, "+a); 
    }
 
    public static void main(String[] args) {
        runValue();
    }
 
}
