package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;

/**
 * Created by jt on 2018-10-28.
 */
@Tag("model")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface ModelTests {

    @BeforeEach
    default void beforeEach(TestInfo testInfo) {
        System.out.println("Running test \"" + testInfo.getDisplayName() + "\"");
    }
}
