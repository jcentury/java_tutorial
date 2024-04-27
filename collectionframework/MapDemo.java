package collectionframework;

import java.util.*;
 
public class MapDemo {
    //map은 key값은 중복이 불가능하지만 value 값은 중복이 가능함
 
    public static void main(String[] args) {
        //key의 타입과 value의 타입을 순차적으로 정해줌 예 <String, Integer>
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        //put은 map에서만 사용가능 (key, value) 추가
        a.put("one", 1);
        a.put("two", 2);
        a.put("three", 3);
        a.put("four", 4);
        System.out.println(a.get("one"));
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));
         
        iteratorUsingForEach(a);
        iteratorUsingIterator(a);
    }
     
    //map에 들어있는 모든 값을 가져오는 방법
    static void iteratorUsingForEach(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
     
    static void iteratorUsingIterator(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> i = entries.iterator();
        while(i.hasNext()){
            Map.Entry<String, Integer> entry = i.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
 
}