package test.demoQa;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.BaseTest;

public class DynamicProperties extends BaseTest {
    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        pages.demoQa.DynamicProperties.open();
    }

    @Test
    public void testButtonAfterEnabled() {
        pages.demoQa.DynamicProperties.clickButtonAferEnabled();

    }

    @Test
    public void testAfterButtonColorChange(){
        pages.demoQa.DynamicProperties.clickButtonAfterColorChange();
        // mt-4 btn btn-primary before
        //mt-4 text-danger btn btn-primary

    }
}
