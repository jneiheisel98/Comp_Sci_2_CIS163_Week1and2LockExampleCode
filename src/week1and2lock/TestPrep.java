package week1and2lock;

import org.junit.Assert;
import org.junit.Test;

public class TestPrep {
    @Test
    public void testCorrectCode() {
        Lock d = new Lock("246");
        Lock da = new Lock("246");
        d.enterCode("246");
        Assert.assertTrue(d.isUnlock());
        d.enterCode("999");
        Assert.assertTrue(d.isUnlock());
        d.enterCode("234");
        Assert.assertFalse(d.isUnlock());
        Assert.assertTrue(d.equals(da));
    }
    @Test (expected = IllegalArgumentException.class)
    public void testBlankLock() {
        Lock d = new Lock("");
    }

}
