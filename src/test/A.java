package test;

public class A{

    protected String field;

    public void doSomething1(){
        System.out.println("something 10");
    }

    public void doSomething1(String number){
        System.out.println("something " + number);
    }

    public void doSomething1(int number){
        System.out.println("something " + number);
    }

    public void doSomething1(short number){
        System.out.println("something " + number);
    }

    public void doSomething2(){
        System.out.println("something 2");
    }

    protected void doSomething15(){
        System.out.println("something 15");
    }
}
