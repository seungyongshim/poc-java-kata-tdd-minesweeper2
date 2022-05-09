import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CellTest {
    @Test
    void should_bomb_true()
    {
        // arrange
        var sut = new Cell();
        // act
        sut.setBomb();
        // assert
        assertEquals("*", sut.toString());
    }
}
