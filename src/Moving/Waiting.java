package Moving;

import java.util.concurrent.TimeUnit;

public class Waiting {
    public static void waitInSec(int time) {
     try{
        TimeUnit.SECONDS.sleep(1);
     }
     catch(InterruptedException e) {
        throw new RuntimeException(e);
    }
}
}
