package modifier.samepackage;
import modifier.otherpackage.*;

class SameClassChecker {
    public SameClassChecker(){
        this._public();
        this._default();
        this._private();
        this._protected();
    }
    private void _private() {
        System.out.println("private");
    }
    void _default() {
        System.out.println("default");
    }
    protected void _protected() {
        System.out.println("protected");
    }
    public void _public() {
        System.out.println("public");
    }
}

class SamePackageChecker extends Same {
    public SamePackageChecker() {
        Same same = new Same();
        //같은 패키지 private 제외 모두 접근 가능
        same._public();
        same._protected();
        same._default();
        // same._private();

        //같은 패키지 상속 private 제외 모두 접근 가능
        this._public();
        this._default();
        // this._private();
        this._protected();
    }
}

class OtherPackageChecker extends Other {
    public OtherPackageChecker() {
        Other other = new Other();
        //다른 패키지 public만 접근 가능
        other._public();
        // other._protected();
        // other._default();
        // other._private();

        //다른패키지, 서브클래스 상속관계라면 protected도 사용 가능
        this._public();
        // this._default();
        // this._private();
        this._protected();
    }
}
public class Checker {
    
}
