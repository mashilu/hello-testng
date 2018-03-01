package example1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2018/3/1 0001.
 */
public class SimpleTest {

    @BeforeClass
    public void setUp() {
    }

    @Test(groups = {"fast"})
    public void aFastTest() {
        System.out.println("Fast Test");
    }

    @Test(groups = {"slow"})
    public void aSlowTest() {
        System.out.println("Slow Test");
    }

}
