public class MyThread1 extends Thread {

public void run()
{
System.out.println("thread is runing");
}

public static void main(String[] args) {
// TODO Auto-generated method stub

MyThread1 t1=new MyThread1();
MyThread1 p1=new MyThread1();
MyThread1 p2=new MyThread1();
MyThread1 p3=new MyThread1();
p1.start();

// getting priority

System.out.println("p1 priority is:"+p1.getPriority());
System.out.println("p1 priority is:"+p2.getPriority());

System.out.println("p1 priority is:"+p3.getPriority());

//setting priority

t1.start();
t1.setPriority(4);
int p=t1.getPriority();
System.out.println("thread priority set to:"+p);

//min,max,normal
System.out.println("p1 priority is:"+p2.MAX_PRIORITY);
System.out.println("p1 priority is:"+p2.MIN_PRIORITY);
System.out.println("p1 priority is:"+p2.NORM_PRIORITY);
//current thread

System.out.println("thread is current running:"+p1.currentThread());


}

}