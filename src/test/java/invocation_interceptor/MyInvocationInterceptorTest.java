package invocation_interceptor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MyInvocationInterceptor.class)
class MyInvocationInterceptorTest {

    @Test
    void test() {

    }
}
