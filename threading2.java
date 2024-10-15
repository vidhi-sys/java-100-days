// threading using runnable keyword
class MyRunnable implements Runnable{
    public void run(){
        //while(true)
        int i=0;
        while(i<40000)
        {
        System.out.println("i am chatting");
        i++;
}
    }
}
class MyRunnable1 implements Runnable{
    public void run(){
        //while(true)
        int i=0;
        while(i<40000){
        System.out.println("i am cooking");
        i++;
}
    }
}

public class threading2 {
    public static void main(String[] args) {
        MyRunnable rb = new MyRunnable();
        Thread t= new Thread(rb);
        t.start();
        MyRunnable1 rb1 = new MyRunnable1();
        Thread t1= new Thread(rb1);
        t1.start();
    }
}
