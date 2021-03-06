package jmri.jmrit.display.controlPanelEditor.shape;

import java.awt.GraphicsEnvironment;
import jmri.jmrit.display.EditorScaffold;
import jmri.util.JUnitUtil;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Paul Bender Copyright (C) 2017	
 */
public class PositionableRectangleTest extends PositionableShapeTest {

    @Test
    public void testCTor() {
        Assume.assumeFalse(GraphicsEnvironment.isHeadless());
        Assert.assertNotNull("exists",p);
    }

    // The minimal setup for log4J
    @Override
    @Before
    public void setUp() {
        JUnitUtil.setUp();
        JUnitUtil.resetProfileManager();

        if(!GraphicsEnvironment.isHeadless()){
           editor = new EditorScaffold();
           p = new PositionableRectangle(editor);
        }
    }

    // private final static Logger log = LoggerFactory.getLogger(PositionableRectangleTest.class);

}
