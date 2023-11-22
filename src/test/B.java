package test;

public class B extends A{

    @Override
    public void doSomething1() {
        System.out.println("something 1");
        super.doSomething1();
    }


    public void doSomething3(){
        System.out.println("something 3");
    }

    public void doSomething4(){
        System.out.println("something 4");
    }
}
