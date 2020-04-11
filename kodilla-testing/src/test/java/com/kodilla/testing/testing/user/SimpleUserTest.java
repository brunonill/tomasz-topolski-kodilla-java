package com.kodilla.testing.testing.user;

import org.junit.Assert;
import org.junit.Test;

public class SimpleUserTest {

    @Test

    public void testUserSimple() {

        SimpleUser simpleUser = new SimpleUser("Tomasz");
        String input = simpleUser.getUsername();
        Assert.assertEquals("Tomasz", input);


    }
}