import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) {
       long t = TimeUnit.SECONDS.toMillis(5);
        System.out.println(t);
    }
}
