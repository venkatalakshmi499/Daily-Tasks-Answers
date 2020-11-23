package com.lamba;

import java.util.*;

public class StreamStudentEx
{
    String sname;
    int mm;
    int ms;
    int sm;
    private Collection al;
    
    public StreamStudentEx(final String sname, final int mm, final int ms, final int sm) {
        this.sname = sname;
        this.mm = mm;
        this.ms = ms;
        this.sm = sm;
    }
    
    public double percentage(final int mm, final int ms, final int sm) {
        final int percent = mm + ms + sm / 3;
        return percent;
    }
    
    public void assignGrades(final double n, final String s) {
        throw new Error("Unresolved compilation problems: \n\tSyntax error, insert \")\" to complete MethodInvocation\n\tSyntax error, insert \")\" to complete MethodInvocation\n\tSyntax error, insert \";\" to complete LocalVariableDeclarationStatement\n\tSyntax error on token \",\", ; expected\n\tSyntax error on tokens, ( expected instead\n");
    }
    
    @Override
    public String toString() {
        return "StreamStudentEx [sname=" + this.sname + ", mm=" + this.mm + ", ms=" + this.ms + ", sm=" + this.sm + "]";
    }
}