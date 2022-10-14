import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;

class someChecker implements StringChecker {
    String str;
    public someChecker() {
        this.str = str;
    }
    public boolean checkString(String s) {
        return this.str.contains(s);
    }
}

public class ListTests {

    @Test
    public void testFilter() {
        List<String> lstring = new ArrayList<>( );
        List<String> lstring1 = new ArrayList<>( );
        StringChecker sc = new someChecker();
        lstring1 = ListExamples.filter(lstring, sc.checkString("e"));
        assertEquals(lstring, lstring1);
    }

    @Test
    public void testFilter2() {
        List<String> lstring = new ArrayList<>();
        List<String> lstring1 = new ArrayList<>();
        lstring = lstring.add("apple");
        lstring = lstring.add("banana");
        StringChecker sc = new someChecker();
        lstring1 = ListExamples.filter(lstring, sc.checkString("e"));
        lstring.remove("banana");
        assertEquals(lstring, lstring1);
    }
}