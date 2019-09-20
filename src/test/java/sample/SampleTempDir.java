package sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;

public class SampleTempDir {

    @TempDir
    Path tempDirPath;

    @Test
    void test() {
        System.out.println(tempDirPath);
    }
}
