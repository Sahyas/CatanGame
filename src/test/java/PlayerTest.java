import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    @Test
    public void startingValuesForPlayer() {
        Player p1 = new Player(Color.Blue);
        assertEquals(5, p1.getVillages());
        assertEquals(4, p1.getCities());
        assertEquals(15, p1.getRoads());
        assertEquals(0, p1.getWood());
        assertEquals(0, p1.getClay());
        assertEquals(0, p1.getStone());
        assertEquals(0, p1.getWheat());
        assertEquals(0, p1.getWool());
        assertEquals(0, p1.getPoints());
        assertEquals(Color.Blue, p1.getColor());
    }


}