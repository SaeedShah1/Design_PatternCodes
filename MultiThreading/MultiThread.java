package MultiThreading;

public class MultiThread implements Runnable {

    Mythread mythread;


    @Override
    public void run() {
        // TODO Auto-generated method stub
    try{
       mythread.printTable(10);
    }catch(Exception e){
        e.printStackTrace();
    }
    }



    
}
