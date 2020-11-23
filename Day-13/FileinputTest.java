package com.src;

import java.io.*;
import org.junit.*;

public class FileinputTest
{
    @Test
    public void test() throws IOException {
        final Fileinput f = new Fileinput();
        final String s = "hello";
        final String s2 = String.valueOf(s) + ".txt";
        f.files(s);
        String s3 = "";
        try {
            final FileInputStream fis = new FileInputStream(s2);
            int i = 0;
            while ((i = fis.read()) != -1) {
                s3 = String.valueOf(s3) + (char)i;
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertEquals((Object)s, (Object)s3);
    }
}