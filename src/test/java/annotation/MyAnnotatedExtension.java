package annotation;

import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.commons.support.AnnotationSupport;

import java.util.Arrays;
import java.util.Optional;

public class MyAnnotatedExtension implements BeforeEachCallback {

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        System.out.println(context);
        System.out.println(context.getElement());
        System.out.println(Arrays.toString(context.getElement().get().getAnnotations()));

        Optional<MyAnnotation> annotation = AnnotationSupport.findAnnotation(context.getElement(), MyAnnotation.class);
    }
}
