import org.example.TimeUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeUtilsTest {

    @ParameterizedTest
    @CsvSource({
            "3600, '1:00:00'",
            "3661, '1:01:01'",
            "7200, '2:00:00'",
            "0, '0:00:00'",
            "86399, '23:59:59'",
            "86400, '-1'",
            "90000, '-1'"
    })
    void testSecToTime(int seconds, String expectedTime) {
        String result = TimeUtils.secToTime(seconds);
        assertEquals(expectedTime, result);
    }

    @Test
    void testSecToTimeNegativeInput() {
        String result = TimeUtils.secToTime(-100);
        assertEquals("-1", result);
    }

    @Test
    void testSecToTimeLargeInput() {
        String result = TimeUtils.secToTime(100000);
        assertEquals("-1", result);
    }
}