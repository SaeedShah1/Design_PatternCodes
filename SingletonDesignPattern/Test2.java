package SingletonDesignPattern;
import java.util.List;

public class Test2 {
 
    private static Test2 test2Instance;

    // mAking constructor private
    private Test2() {
    }

    // Singleton Pattern
    public static Test2 getInstance() {

        if (test2Instance == null) {
            System.out.println("making new instance");
             test2Instance = new Test2();
            return test2Instance;
        }
        System.out.println("returning same instance! ");

        return test2Instance;
    }

    List<String> names;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    private void print() {

        System.out.println("Test 2 method print");
    }

}