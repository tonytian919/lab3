import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> lstring = new ArrayList( );
        List<String> lstring1 = new ArrayList( );
        lstring.filter(new checkString());
        assertArrayEquals( lstring1, ListExamples.filter( lstring, checkString(String s) ));
    }
}