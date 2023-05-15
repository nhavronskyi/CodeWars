package seven;


import codewars.seven.BuildASquare;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BuildASquareTest {
    @Test
    public void exampleTests() {
        assertEquals("+++\n+++\n+++", BuildASquare.generateShape(3));
        assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", BuildASquare.generateShape(5));
        assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", BuildASquare.generateShape(8));
    }
}
