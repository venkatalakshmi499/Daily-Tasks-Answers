package com.src;

import java.util.Scanner;

import java.io.File;
import java.io.FileReader;

public class Excercise5 {
public boolean fileExists(String a)
{
File f;
try
{
f=new File(a);
//return true;
}
catch(Exception e)
{
System.out.println("file not found exception");
return false;
}
return true;

}
public boolean isInt(String b)
{
try
{
int i=Integer.parseInt(b);
return true;
}
catch(Exception e)
{
System.out.println("Number format exception");
return false;
}
}
public boolean isDouble(String c)
{
double i=0;
try
{
i=Double.parseDouble(c);

}
catch(Exception e)
{
System.out.println("Nubmer format exception");
//return false;
}
if(i<0 || i>0)
{
return true;
}
else
{
return false;
}

}


}
