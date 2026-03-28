package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest
    @CsvSource({
            "xxggxx,true",
            "xxgxx,false",
            "xxggyygxx,false",
            "gg,true",
            "g,false",
            "'',true"
    })
    public void testGHappy(String input, boolean expected) {
        boolean result = new GHappy().gHappy(input);
        Assertions.assertEquals(expected, result);
    }
}