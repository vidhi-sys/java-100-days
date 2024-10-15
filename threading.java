class MyThread extends Thread{
    // by extending thread class 
    //overiting run function
    public void run(){
        int i =0;
        while(i<4000){
        System.out.println("thread class is running");
        i++;
    }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<4000){
        System.out.println("thread class 2 is running");
    i++;
}
    }

}
public class threading {
    //multiprocessing and multitasking together make multi threading
    public static void main(String[] args) {
        MyThread my = new MyThread();
        MyThread2 my1 = new MyThread2();
        my.start();
        my1.start();// calling start function
    }
}


