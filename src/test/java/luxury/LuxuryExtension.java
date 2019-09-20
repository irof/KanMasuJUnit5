package luxury;

import org.junit.jupiter.api.extension.*;

import java.util.stream.Stream;

public class LuxuryExtension implements
        AfterAllCallback,
        AfterEachCallback,
        AfterTestExecutionCallback,
        BeforeAllCallback,
        BeforeEachCallback,
        BeforeTestExecutionCallback,
        ExecutionCondition,
        InvocationInterceptor,
        LifecycleMethodExecutionExceptionHandler,
        ParameterResolver,
        TestExecutionExceptionHandler,
        TestInstanceFactory,
        TestInstancePostProcessor,
        TestTemplateInvocationContextProvider,
        TestWatcher {
    @Override
    public void afterAll(ExtensionContext context) throws Exception {

    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {

    }

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {

    }

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {

    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {

    }

    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {

    }

    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
        return ConditionEvaluationResult.enabled("nothing");
    }

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return false;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return null;
    }

    @Override
    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {

    }

    @Override
    public Object createTestInstance(TestInstanceFactoryContext factoryContext, ExtensionContext extensionContext) throws TestInstantiationException {
        try {
            return factoryContext.getTestClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new TestInstantiationException("", e);
        }
    }

    @Override
    public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {

    }

    @Override
    public boolean supportsTestTemplate(ExtensionContext context) {
        return false;
    }

    @Override
    public Stream<TestTemplateInvocationContext> provideTestTemplateInvocationContexts(ExtensionContext context) {
        return null;
    }
}
