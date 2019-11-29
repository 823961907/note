import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class JunitCoreDemo {
 
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(HelloJunit.class);
        //System.out.println(result.getRunCount());
    }
}
