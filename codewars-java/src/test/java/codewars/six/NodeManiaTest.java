package codewars.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class NodeManiaTest {
    @Test
    void sampleTest() {
        assertEquals(3, NodeMania.searchKFromEnd(NodeMania.Node.build(5, 2, 3, 1), 2), "Failed for 5 -> 2 -> (3) -> 1, k = 2");
        assertEquals(1, NodeMania.searchKFromEnd(NodeMania.Node.build(5, 2, 3, 1), 1), "Failed for 5 -> 2 -> 3 -> (1), k = 1");
        assertEquals(23, NodeMania.searchKFromEnd(NodeMania.Node.build(19, 18, 17, 16, 4, 3, 4, 2, 1, 65, 23, 3, 12, 34, 2, 6, 2), 7), "Failed for 19 -> 18 -> 17 -> 16 -> 4 -> 3 -> 4 -> 2 -> 1 -> 65-> (23) -> 3 -> 12 -> 34 -> 2 -> 6 -> 2, k = 7");
        assertNull(NodeMania.searchKFromEnd(NodeMania.Node.build(3, 2, 1, 5), 5), "Failed for 3 -> 2 -> 1 -> 5, k = 5\n remember if it is outside the bounds of list to return null");
    }
}
