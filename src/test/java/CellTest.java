import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CellTest {
    @Test
    void should_bomb_true()
    {
        // arrange
        var sut = new Cell();
        // act
        var ret = sut.setBomb();
        // assert
        assertEquals("*", ret.toString());
    }
}
