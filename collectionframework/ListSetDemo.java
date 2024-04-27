package collectionframework;

//arraylist는 중복을 허용하지만 hashset은 중목을 허용하지 않는다
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
 
import java.util.Iterator;
 
public class ListSetDemo {
 
    public static void main(String[] args) {
        //arraylist는 입력한 그대로 출력
        Collection<String> al = new ArrayList<String>();
        //arraylist나 hashset은Collection이라는 인터페이스를 구현하고 iterator라는 공통의 api를 사용해서 Collection을 대신 사용 가능함
        // ArrayList<String> al = new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("two");
        al.add("three");
        al.add("three");
        al.add("five");
        System.out.println("array");
        //ai라는 iterator에 hashset의 참조값을 넣는다
        Iterator ai = al.iterator();
        //hasNext는 값을 순차적으로 찾는다
        while(ai.hasNext()){
            //next는 하나의 값 출력하고 삭제한다
            System.out.println(ai.next());
        }
         
        //hashset은 중복이 발생하면 하나만 출력 즉 집합이다.
        Collection<String> hs = new HashSet<String>();
        // HashSet<String> hs = new HashSet<String>();
        hs.add("one");
        hs.add("two");
        hs.add("two");
        hs.add("three");
        hs.add("three");
        hs.add("five");
        Iterator hi = hs.iterator();
        System.out.println("\nhashset");
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }
    //hash set으로 활용가능한 것
    //교집합 A.retainAll(B);
    //차집합 A.removeAll(B);
    //부분집합 A.containsAll(B);
    //합집합 A.addAll(B);
}
 