package SingletonDesignPattern;
import java.util.List;

public class Test2 {

    private static Test2 Test2Instance;

    // mAking constructor private
    private Test2() {
    }

    // Singleton Pattern
    public static Test2 getInstance() {

        if (Test2Instance == null) {
            return new Test2();
        }

        return Test2Instance;
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