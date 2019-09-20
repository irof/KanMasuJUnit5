package invocation_interceptor;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.InvocationInterceptor;
import org.junit.jupiter.api.extension.ReflectiveInvocationContext;

import java.lang.reflect.Method;

public class MyInvocationInterceptor implements InvocationInterceptor {

    @Override
    public void interceptTestMethod(Invocation<Void> invocation, ReflectiveInvocationContext<Method> invocationContext, ExtensionContext extensionContext) throws Throwable {

    }
}
