package MultiThreading;

public class MultiThread2 implements Runnable {

    Mythread mythread;
    @Override
    public void run() {
        // TODO Auto-generated method stub
    try{
       mythread.printTable(5);
    }catch(Exception e){
        e.printStackTrace();
    }
    }



    
}
