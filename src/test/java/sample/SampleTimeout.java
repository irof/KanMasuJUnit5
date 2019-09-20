package sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

@Timeout(value = 3,
        unit = TimeUnit.MILLISECONDS)
public class SampleTimeout {

    @Test
    void test() throws Exception {
        TimeUnit.MILLISECONDS.sleep(5);
    }
}
