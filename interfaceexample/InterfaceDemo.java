package interfaceexample;

//interface는 명세서 interface안의 함수를 모두 구현해야함
//모두 pulblic이여야 함
//구체적인 로직이나 상태를 갖을 수 없다
interface I1{
    public void x();
}

interface I2{
    public void z();
}

//인터페이스도 상속 가능
interface I3 extends I2{
    public void y();
}

//하나의 클래스는 복수의 인터페이스를 구현 가능
class A implements I1, I2 {
    public void x() {};
    public void z() {};
}

class B implements I3 {
    public void y() {};
    public void z() {};
}

public class InterfaceDemo {
    
}
