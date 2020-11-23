package com.lamba;

public class StudentMarks
{
    String name;
    int total;
    int percent;
    int physicsmarks;
    int sciencemarks;
    int socialmarks;
    char grade;
    
    public StudentMarks(final String name, final int physicsmarks, final int sciencemarks, final int socialmarks, final int total, final int percent, final char grade) {
        this.name = name;
        this.physicsmarks = physicsmarks;
        this.sciencemarks = sciencemarks;
        this.socialmarks = socialmarks;
        this.total = total;
        this.percent = percent;
        this.grade = grade;
    }
    
    public StudentMarks() {
    }
    
    @Override
    public String toString() {
        return "StudentMarks name=" + this.name;
    }
}