package jmri.implementation.configurexml;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * LsDecSignalHeadXmlTest.java
 *
 * Description: tests for the LsDecSignalHeadXml class
 *
 * @author   Paul Bender  Copyright (C) 2016
 */
public class LsDecSignalHeadXmlTest {

    @Test
    public void testCtor(){
      Assert.assertNotNull("LsDecSignalHeadXml constructor",new LsDecSignalHeadXml());
    }

    // The minimal setup for log4J
    @Before
    public void setUp() {
        apps.tests.Log4JFixture.setUp();
    }

    @After
    public void tearDown() {
        apps.tests.Log4JFixture.tearDown();
    }

}

