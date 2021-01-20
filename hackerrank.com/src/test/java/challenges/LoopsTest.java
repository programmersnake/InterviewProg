package challenges;

import org.junit.Test;

public class LoopsTest {

    @Test
    public void test1() {
        Loops loops1 = new Loops();
        for(int i = 1; i<=10; i++)
            System.out.println(i + ") " + Loops.getSimpleMath( i ));
    }

}
