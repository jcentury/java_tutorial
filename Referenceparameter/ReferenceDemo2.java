package Referenceparameter;

class A{
    public int id;
    A(int id){
        this.id = id;
    }
}
public class ReferenceDemo2 {
 
    public static void runValue(){
        int a = 1;
        int b = a;
        b = 2;
        System.out.println("runValue, "+a); 
    }
     
    public static void runReference(){
        //인스턴스가 생성되고  a 는 A를 참조함
        A a = new A(1);
        //b도 A인스턴스를 참조해서 값이 바뀌면 같이 바뀜
        A b = a;
        b.id = 2;
        System.out.println("runReference, "+a.id);      
    }
 
    public static void main(String[] args) {
        runValue();
        runReference();
    }
 
}