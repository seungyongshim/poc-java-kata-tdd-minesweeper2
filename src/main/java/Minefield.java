import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Minefield {

    private List<Cell> cells;

    public Minefield(int width, int height, int bombs) {
    }

    public Minefield(int width, int height) {
        cells = Stream.iterate(0, n -> n + 1)
                      .limit(width * height)
                      .map(x -> new Cell())
                      .toList();

        
    }

    public List<Cell> getCells() {
        return cells;
    }
    
}
