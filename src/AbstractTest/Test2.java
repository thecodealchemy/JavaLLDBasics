package AbstractTest;

public class Test2 extends AbstractTest{
    public Test2(){
        System.out.println("Test2 called");
    }

    @Override
    public void shouldHave() {
        System.out.println("2 should have abstracts");
    }
}
