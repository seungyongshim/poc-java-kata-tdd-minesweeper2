import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Minefield {

    private List<Cell> cells;

    public Minefield(int width, int height, int bombs) {
        cells = Stream.iterate(0, n -> n + 1)
                      .limit(width * height)
                      .map(x -> new Cell())
                      .toList();

        new Random().ints(0, width * height)
                    .distinct()
                    .limit(bombs)
                    .forEach(i -> 
                    {
                        cells.get(i).setBomb();
                    });
    }

    public Minefield(int width, int height) {
        this(width, height, 0);
    }

    public List<Cell> getCells() {
        return cells;
    }
    
}
