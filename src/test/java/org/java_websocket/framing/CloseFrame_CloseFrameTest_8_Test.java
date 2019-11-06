package org.java_websocket.framing;

import org.java_websocket.enums.Opcode;
import org.java_websocket.framing.CloseFrame;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CloseFrame_CloseFrameTest_8_Test {
  @Test
  public void CloseFrameTest() throws Exception {
    // Arrange and Act
    CloseFrame closeFrame = new CloseFrame();

    // Assert
    boolean isRSV1Result = closeFrame.isRSV1();
    String toStringResult = closeFrame.toString();
    boolean isRSV3Result = closeFrame.isRSV3();
    boolean transfereMasked = closeFrame.getTransfereMasked();
    String message = closeFrame.getMessage();
    boolean isRSV2Result = closeFrame.isRSV2();
    int closeCode = closeFrame.getCloseCode();
    Opcode opcode = closeFrame.getOpcode();
    Assert.assertFalse(isRSV1Result);
    Assert.assertTrue(closeFrame.isFin());
    Assert.assertEquals(Opcode.CLOSING, opcode);
    Assert.assertEquals(1000, closeCode);
    Assert.assertFalse(isRSV2Result);
    Assert.assertEquals("", message);
    Assert.assertFalse(transfereMasked);
    Assert.assertFalse(isRSV3Result);
    Assert.assertEquals(
        "Framedata{ optcode:CLOSING, fin:true, rsv1:false, rsv2:false, rsv3:false, payloadlength:[pos:0, len:2], payload:\u0003�}code: 1000",
        toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
