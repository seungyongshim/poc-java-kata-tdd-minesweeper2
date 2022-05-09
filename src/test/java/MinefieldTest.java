import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MinefieldTest {
    @Test
    void should_create()
    {
        var sut = new Minefield(3, 4);

        assertEquals(12, sut.getCells().size());
        assertEquals(".", sut.getCells().get(0).toString());
    }

    @Test
    void should_bombs()
    {
        var sut = new Minefield(3, 4, 3);

        assertEquals(3, sut.getCells()
                                     .stream()
                                     .filter(x -> { return x.isBomb();})
                                     .count());
    }
}
