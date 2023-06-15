package MultiThreading;

public class Mythread  {


   

    static synchronized void printTable(int value) throws InterruptedException  {
    
        for (int i=1; i<=10; i++){
            Thread.sleep(500);
            System.out.println(value + " x " +i +" = "+ " " + value*i);
        }


        
   } 
    
}
