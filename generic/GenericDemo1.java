package generic;

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
//복수의 제너릭이 필요할 땐 , 를 사용한다 보통 T부터 시작해서 다음 알파벳 순으로 이동
//데이터 타입을 지정하지 않음
class Person<T, S>{
    public T info;
    public S id;
    Person(T info, S id){ 
        this.info = info;
        this.id = id;
    }
    // 메소드에서도 사용 가능
    public <U> void printInfo(U info){
        System.out.println(info);
    }
}
public class GenericDemo1 {
    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo(1);
        //Integer 대신 valueOf(int)사용 
        Integer i = Integer.valueOf(10);    
        //기본 데이터 타입을 wrapper 클래스를 사용한다 객체로 사용
        // Person<EmployeeInfo, Integer> p1 = new Person<>(e, i);
        //사용하면 위의 코드 생략 가능
        Person p1 = new Person(e, i);
        // p1.<EmployeeInfo>printInfo(e);
        p1.printInfo(e);
    }
}