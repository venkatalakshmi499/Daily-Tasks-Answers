package com.lamba;

public class Student
{
    int sid;
    String sname;
    String sadd;
    
    public Student(final int sid, final String sname, final String sadd) {
        this.sid = sid;
        this.sname = sname;
        this.sadd = sadd;
    }
    
    @Override
    public String toString() {
        return "Student [sid=" + this.sid + ", sname=" + this.sname + ", sadd=" + this.sadd + "]";
    }
}