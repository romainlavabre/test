package test;

public class Test1Impl implements Test1 {

    public static final int CONST_1 = 0;

    private int abcd;


    @Override
    public void doSomething(){
        System.out.println( abcd );
    }


    @Override
    public Test1Impl setAbcd( int property2 ) {
        this.abcd = property2;

        return this;
    }



    @Override
    public Test1Impl setAbcd2( int property2 ) {
        this.abcd = property2;

        return this;
    }

}
