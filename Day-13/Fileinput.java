package com.src;

import java.io.*;

public class Fileinput
{
    FileOutputStream fos;
    
    public Fileinput() {
        this.fos = null;
    }
    
    public void files(final String name) {
        try {
            final String filename = String.valueOf(name) + ".txt";
            this.fos = new FileOutputStream(filename);
            final byte[] b = name.getBytes();
            this.fos.write(b);
        }
        catch (Exception e) {
            e.printStackTrace();
            try {
                this.fos.close();
            }
            catch (IOException e2) {
                e2.printStackTrace();
            }
            return;
        }
        finally {
            try {
                this.fos.close();
            }
            catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        try {
            this.fos.close();
        }
        catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}