package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest
    @CsvSource({
            "abc,3,def",
            "xyz,3,abc",
            "abc,-3,xyz",
            "hello,1,ifmmp",
            "abc,0,abc"
    })
    public void testCipher(String message, int shift, String expected) {
        String result = new CaesarShiftCipher().CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expected, result);
    }
}