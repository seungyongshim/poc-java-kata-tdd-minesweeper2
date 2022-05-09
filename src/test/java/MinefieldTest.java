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
}
