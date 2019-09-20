package mahou;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MahouExtension.class)
class MahouTest {

    @Test
    void 絶対失敗する悲しいテスト() {
        throw new RuntimeException();
    }
}
