package codewars.seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildingBlocksTest {
    @Test
    public void testBasicBlock() {
        var block = new BuildingBlocks(new int[]{2, 2, 2});
        assertEquals(2, block.getWidth());
        assertEquals(2, block.getLength());
        assertEquals(2, block.getHeight());
        assertEquals(8, block.getVolume());
        assertEquals(24, block.getSurfaceArea());
    }

}