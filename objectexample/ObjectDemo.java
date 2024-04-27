package objectexample;

class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    public boolean equals(Object obj) {
        //자식을 부모로 형 변환 할 때는 자동이지만 부모를 자식으로 바꿀 때는 명시적으로 지정 해줘야 함 예 (Student)
        Student _obj = (Student)obj;
        return name == _obj.name;
    }
}
 
public class ObjectDemo {
 
    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        //println(s1 == s2.toString)처럼 toString도 object지만 생략 가능하다
        System.out.println(s1 == s2);
        //객체가 다르지만 논리적인 값만 비교하고 싶을 떄 즉 객체를 비교할 떄 equals 사용
        System.out.println(s1.equals(s2));
 
    }
 
}