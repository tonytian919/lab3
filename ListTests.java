import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;

// given a substring, checkString checks if the parameter contains the substring.
class someChecker implements StringChecker {
    String str;
    public someChecker(String s) {
        this.str = s;
    }
    public boolean checkString(String s) {
        return s.contains(this.str);
    }
}

public class ListTests {

    @Test
    public void testFilter() {
        List<String> input = new ArrayList<>( );
        input.add("head");
        input.add("hello");
        input.add("water");
        input.add("bean");
        input.add("yellow");
        input.add("mean");
        input.add("lean");
        input.add("memo");
        input.add("leak");
        List<String> expected = new ArrayList<>( );
        expected.add("head");
        expected.add("bean");
        expected.add("mean");
        expected.add("lean");
        expected.add("leak");
        List<String> output = new ArrayList<>( );
        StringChecker sc = new someChecker("ea");
        output = ListExamples.filter(input, sc);
        assertEquals(expected, output);
    }

    // @Test
    // public void testFilter2() {
    //     List<String> lstring = new ArrayList<>();
    //     List<String> lstring1 = new ArrayList<>();
    //     lstring.add("apple");
    //     lstring.add("banana");
    //     StringChecker sc = new someChecker();
    //     lstring1 = ListExamples.filter(lstring, sc);
    //     assertEquals(lstring, lstring1);
    // }
}