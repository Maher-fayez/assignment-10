package question1;

import edu.miu.question1.ArrayFlattener;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFlattenerTest {

    private ArrayFlattener flattener;

    @Before
    public void setUp(){
        flattener = new ArrayFlattener();
    }

    @Test
    public void testFlattenArrayWithValidInput(){
        Integer[][] nestedArray = {{1,3},{0},{4,5,6}};
        Integer[] expected = {1,3,0,4,5,6};

        Integer[] result = flattener.flattenArray(nestedArray);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFlattenArrayWithNullInput(){
        Integer[][] nestedArray = null;
        Integer[] result = flattener.flattenArray(nestedArray);
        assertNull(result);
    }

}
