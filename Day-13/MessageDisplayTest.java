package com.src;

import org.junit.*;

public class MessageDisplayTest
{
    String message;
    MessageDisplay md;
    
    public MessageDisplayTest() {
        this.message = "venky";
        this.md = new MessageDisplay(this.message);
    }
    
    @Test
    public void testAppendMessage() {
        System.out.println("this is 2nd message");
        Assert.assertEquals((Object)("new" + this.message), (Object)this.md.appendMessage());
    }
}