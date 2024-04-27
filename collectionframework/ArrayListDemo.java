package collectionframework;

//ArrayList를 사용하기 위해서는 import 해줘야함
import java.util.ArrayList;

public class ArrayListDemo {
 
    public static void main(String[] args) {
        //arraylist와 똑같지만 사용하기 까다로움
        // String[] arrayObj = new String[2];
        // arrayObj[0] = "one";
        // arrayObj[1] = "two";
        // //오류발생
        // // arrayObj[2] = "three";
        // for(int i=0; i<arrayObj.length; i++){
        //     System.out.println(arrayObj[i]);
        // }

         //제너릭으로 타입 변환이 가능함
        // ArrayList<String> al = new ArrayList<String>();
        ArrayList al = new ArrayList();
        //인자의 데이터 타입이 object로 저장된다
        al.add("one");
        al.add("two");
        al.add("three");
        //arraylist는 size를 통해서 얼마나 들어 있는지 확인 가능
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }
    }
 
}