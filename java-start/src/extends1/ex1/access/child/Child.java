package extends1.ex1.access.child;

import extends1.ex1.access.Parent;

public class Child extends Parent {


    public void  call() {
        publicValue = 1;
        protectedValue = 1;
//        defaultValue= 1;
//        privateValue = 1;


        publicMethod();
        protectedMethod();

        printParent();
    }
}
