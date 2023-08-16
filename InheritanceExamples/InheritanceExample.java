package InheritanceExamples;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InheritanceExample {

    public static void main(String[] args) {

        ParentClass parentClassObject = new ParentClass();

        ChildClass childClassObject = new ChildClass();

        ParentClass childClassObjectWithParentRef = new ChildClass();
        System.out.print("\n");
        System.out.println("------Parent Object------\n");
        parentClassObject.message();
        System.out.print("\n");
        System.out.println("-------Child Object------\n");

        childClassObject.message();
        System.out.print("\n");
        System.out.println("-------Child Object With Parent Ref------\n");

        childClassObjectWithParentRef.message();




    //    Integer arr [] = {2999,10,11,80,60,1000,999,3000,2000,1999,50,66,80,4,55,33,2,5,700,9,67,225,23};

    //    List<Integer> arrayList = Arrays.asList(arr);
    //    Integer maximum = arrayList.stream().max(Comparator.comparing(Integer::valueOf)).get();
    //    System.out.println("through stream"+ maximum);
    //     int max =0;
    //     int secondHighest =0;
    //     int temp = 0;
    //     for (int i = 0; i<arr.length;i++){    
    //         for(int j= i+1; j<arr.length;j++){
    //             if(arr[j]<arr[i]){
    //                 temp = arr[i];
    //                 arr[i]= arr[j];
    //                 arr[j] = temp;

    //             }
    //         }
        
     
    //     }
 

    //     max = arr[arr.length-1];
    //     secondHighest = arr[arr.length-2];
    //     System.out.println("Max Number  "+  max );
    //     System.out.println("Second Max Number  "+  secondHighest);


    }

}
