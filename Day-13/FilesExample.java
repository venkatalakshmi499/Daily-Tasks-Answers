package com.src;

import java.io.*;

public class FilesExample
{
    public static void main(final String[] args) {
        FileWriter f1 = null;
        try {
            f1 = new FileWriter("sample.txt");
            f1.write("Venkatalakshmi");
            System.out.println("Written to the file");
        }
        catch (IOException e) {
            e.printStackTrace();
            try {
                f1.close();
            }
            catch (IOException i) {
                i.printStackTrace();
            }
            return;
        }
        finally {
            try {
                f1.close();
            }
            catch (IOException i) {
                i.printStackTrace();
            }
        }
        try {
            f1.close();
        }
        catch (IOException i) {
            i.printStackTrace();
        }
    }
}