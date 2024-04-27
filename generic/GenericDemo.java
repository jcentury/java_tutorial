package generic;

abstract class Info{
    public abstract int getLevel();
}
//인터페이스도 가능
class EmployeeInfo extends Info{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
//제네릭에서 사용하는 extends는 부모를 의미
class Person1<T extends Info>{
    public T info;
    Person1(T info){ this.info = info; }
}
public class GenericDemo {
    public static void main(String[] args) {
        //<EmployeeInfo>는 부모클래스인 info에 있으므로 사용가능 생략가능
        Person1<EmployeeInfo> p1 = new Person1<EmployeeInfo>(new EmployeeInfo(1));
        //String의 자식이 아니므로 오류 발생
        // Person1<String> p2 = new Person1<String>("부장");
    }
}