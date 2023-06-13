package MultiThreading;

import java.util.ArrayList;
import java.util.stream.Collectors;


public class ThreadImpl {
    
    public static void main(String[] args) {
    
        
        //Stream API implentation
        ArrayList <String> list = new ArrayList<>();
        list.add("Karachi");
        list.add("Hyd");
        list.add("KHP");
        list.add("LHR");
        list.add("ISB");
        list.add("FSB");
        list.add("SK");
        list =  (ArrayList<String>) list.stream().map((city) ->{
           
            if(city.equalsIgnoreCase("Hyd")){
            city = "Hyderaabad";
            return city ;   
            }
            return city;
            
        }).collect(Collectors.toList());
        Mythread mythread = new Mythread();
        Thread thread = new Thread(mythread);
        System.out.println(list);
        thread.start();
    }
}
