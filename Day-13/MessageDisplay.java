package com.src;

public class MessageDisplay
{
    String message;
    
    public MessageDisplay(final String message) {
        this.message = message;
    }
    
    public String printMessage() {
        return this.message;
    }
    
    public String appendMessage() {
        return "new" + this.message;
    }
}