import org.testng.annotations.Test;

public class SystemTest {
    @Test
    public void printEnvTest() {
        int i = 0;
        for (String key : System.getenv().keySet()) {
            System.out.println(i++ + " ===> " + key);
        }
    }
}
