package instance_factory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MyTestInstanceFactory.class)
class MyTestInstanceFactoryTest {

    String value;

    public MyTestInstanceFactoryTest(String value) {
        this.value = value;
    }

    @Test
    void test() throws Exception {
        assertEquals("hoge", value);
    }
}
