import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by serna on 2/18/16.
 */
public class TestHelloWorld {

    @Test
    public void testHelloWorld(){
        HelloWorldApp helloWorldApp = new HelloWorldApp();
        assertTrue("Hello world test", helloWorldApp != null);
    }

    @Test
    public void testNewFeatureInANewBranch(){
        HelloWorldApp helloWorldApp = new HelloWorldApp();
        assertTrue("Test he new feature", helloWorldApp != null);
    }
}
