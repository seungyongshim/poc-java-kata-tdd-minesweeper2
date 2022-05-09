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

    @Test
    void should_near_number_1()
    {
        var sut = new Cell();

        sut.setNumber(1);

        assertEquals("1", sut.toString());
    }

    @Test
    void should_covered()
    {
        var sut = new Cell();

        assertEquals(".", sut.toString());
    }
}
