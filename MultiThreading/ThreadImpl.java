package MultiThreading;



public class ThreadImpl {
    
    public static void main(String[] args) {
    
       


        
        
        MultiThread multiThread = new MultiThread();
        MultiThread2 multiThread2 = new MultiThread2();
        Thread t = new Thread(multiThread);
        Thread t2 = new Thread(multiThread2);
      
        
        t2.start();
        t.start();
       
        

        //Stream API implentation
        // ArrayList <String> list = new ArrayList<>();
        // list.add("Karachi");
        // list.add("Hyd");
        // list.add("KHP");
        // list.add("LHR");
        // list.add("ISB");
        // list.add("FSB");
        // list.add("SK");
        // list =  (ArrayList<String>) list.stream().map((city) ->{
           
        //     if(city.equalsIgnoreCase("Hyd")){
        //     city = "Hyderaabad";
        //     return city ;   
        //     }
        //     return city;
            
        // }).collect(Collectors.toList());
      
        // System.out.println(list);
   
    }
}
