package org.pentaho.metadata.util;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class UtilTest {

  @Test
  public void testToId() {
    assertEquals("Hello_World", Util.toId("\"Hello World\""));
    assertEquals("Hello_TIMES_World", Util.toId("\"Hello*World\""));
    assertEquals("Hello_World", Util.toId("\"Hello.World\""));
    assertEquals("Hello_DIVIDED_BY_World", Util.toId("\"Hello/World\""));
    assertEquals("Hello_PLUS_World", Util.toId("\"Hello+World\""));
    assertEquals("_Hello_World_", Util.toId("{[Hello].(World)}"));
  }

}
