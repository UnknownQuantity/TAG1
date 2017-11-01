package tag1;

import java.io.File;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SorterTest {
    
    public SorterTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testSorter() {
        Sorter sort = new Sorter();
        sort.sorter("file.txt", "file2.txt");
        
    }
    
    @Test
    public void testRead() {
        Sorter sort = new Sorter();
        File f1 = new File("file.txt");
        File f2 = new File("file2.txt");
        ArrayList result = sort.read(f1, f2);
        assertEquals(3, result.size());
    }
    
}
