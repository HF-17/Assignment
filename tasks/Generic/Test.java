package tasks.Generic;
@SuppressWarnings("unchecked")
public class Test <T1,T2,T3>{
    private T1 obj1;
    private T2 obj2;
    private T3 obj3;

    private final T1[] arr = (T1[]) new Object[2]; // Dynamic array in generic

    public Test(T1 obj1, T2 obj2, T3 obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public T1 getObj1() {
        return obj1;
    }

    public void setObj1(T1 obj1) {
        this.obj1 = obj1;
    }

    public T2 getObj2() {
        return obj2;
    }

    public void setObj2(T2 obj2) {
        this.obj2 = obj2;
    }

    public T3 getObj3() {
        return obj3;
    }

    public void setObj3(T3 obj3) {
        this.obj3 = obj3;
    }

    public  void showInfo() {
        System.out.println(obj1 + " " +obj1.getClass().getName());
        System.out.println(obj2 + " " +obj2.getClass().getName());
        System.out.println(obj3 + " " +obj3.getClass().getName());

    }
}