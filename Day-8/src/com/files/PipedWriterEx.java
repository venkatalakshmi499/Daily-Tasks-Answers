package com.files;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedWriterEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
final PipedWriter pw=new PipedWriter();
final PipedReader pr=new PipedReader();
pr.connect(pw);

Thread t1=new Thread() {
	public void run()
	{
		try {
			pw.write("This is piped reader & writer example ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
};
 
Thread t2=new Thread()
{
	public void run()
	{
		try {
			int i=pr.read();
			while(i!=1)
			{
				System.out.print((char)i);
				//i=pr.read();
			}
			Thread.sleep(4000);
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
};

t1.start();
t2.start();

	}

}
