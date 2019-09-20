package instance_factory;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstanceFactory;
import org.junit.jupiter.api.extension.TestInstanceFactoryContext;
import org.junit.jupiter.api.extension.TestInstantiationException;

class MyTestInstanceFactory implements TestInstanceFactory {

    @Override
    public Object createTestInstance(TestInstanceFactoryContext factoryContext, ExtensionContext extensionContext) throws TestInstantiationException {
        return null;
    }
}
