package annotation;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MyAnnotatedExtension.class)
@MyAnnotation("class")
class MyAnnotatedTest {

    @MyAnnotation("method")
    @Test
    void test() {

    }
}
