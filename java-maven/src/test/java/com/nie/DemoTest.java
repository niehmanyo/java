package com.nie;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public void testSay()
    {
        Demo d = new Demo();
        String ret = d.say("Nie");
        Assert.assertEquals("NieHello",ret);
    }

}
