package com.src;

import org.junit.*;

public class MessageDisplayTest2
{
    String message;
    MessageDisplay md;
    
    public MessageDisplayTest2() {
        this.message = "rajni";
        this.md = new MessageDisplay(this.message);
    }
    
    @Test
    public void testPrintMessage() {
        System.out.println("this is first message:");
        Assert.assertEquals((Object)this.message, (Object)this.md.printMessage());
    }
}