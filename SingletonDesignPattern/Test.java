package SingletonDesignPattern;

import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws Exception {
        print();


        // Code logic for pallendrome
        // Scanner sc = new Scanner(System.in);
        // String val = sc.next();
        // sc.close();
        // String val2 = "";
        // for (int i = val.length(); i >= 1; i--) {
        // char letter = val.charAt(i - 1);

        // val2 = val2.concat(String.valueOf(letter));

        // }

        // if (val.equals(val2)) {

        // System.out.println("True " + val + "\n val 2:" + val2);
        // } else {
        // System.out.println(" Not true");
        // }

    }

    static void print() throws Exception {
        Object obj = Test2.getInstance();
        Method method = Test2.getInstance().getClass().getDeclaredMethod("print", null);
     
        method.setAccessible(true);
        method.invoke(obj, null);
    }
}
