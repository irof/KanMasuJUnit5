package mahou;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

class MahouExtension
        implements TestExecutionExceptionHandler {

    @Override
    public void handleTestExecutionException(
            ExtensionContext context,
            Throwable throwable) {
    }
}
