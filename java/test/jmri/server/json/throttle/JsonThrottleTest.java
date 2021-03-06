package jmri.server.json.throttle;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jmri.util.JUnitUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Paul Bender Copyright (C) 2017	
 */
public class JsonThrottleTest {

    @Test
    public void testGetThrottle() throws java.io.IOException, jmri.server.json.JsonException {
        java.io.DataOutputStream output = new java.io.DataOutputStream(
                new java.io.OutputStream() {
                    // null output string drops characters
                    // could be replaced by one that checks for specific outputs
                    @Override
                    public void write(int b) throws java.io.IOException {
                    }
                });
        jmri.server.json.JsonMockConnection mc = new jmri.server.json.JsonMockConnection(output);
        ObjectMapper m = new ObjectMapper();
        JsonNode jn = m.readTree("{\"address\":\"" + 1234 + "\"}");
        
        JsonThrottleSocketService ts = new JsonThrottleSocketService(mc);
        JsonThrottle t = JsonThrottle.getThrottle("42",jn,ts);
        Assert.assertNotNull("exists",t);
    }

    // The minimal setup for log4J
    @Before
    public void setUp() {
        JUnitUtil.setUp();
        JUnitUtil.resetProfileManager();
        JUnitUtil.initDebugThrottleManager();
    }

    @After
    public void tearDown() {
        JUnitUtil.tearDown();
    }

    // private final static Logger log = LoggerFactory.getLogger(JsonThrottleTest.class);

}
