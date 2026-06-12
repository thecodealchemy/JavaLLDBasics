package AbstractTest;

public class Test1 extends AbstractTest{
    public Test1(){
        System.out.println("Test1 called");
    }

    @Override
    public void shouldHave() {
        System.out.println("should have abstracts");
    }
}
