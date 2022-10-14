import static org.junit.Assert.*;
import org.junit.*;
import java.util.NoSuchElementException;
import java.util.*;

public class LinkedListtests {
    @Test
    public void testPrepend() {
        LinkedList list = new LinkedList(); 
        Node testNode2 = new Node( 5, null );
        list.prepend( 5 );
        assertEquals( testNode2.value , list.root.value );
    }

    //list null
    @Test
    public void testAppend() {
        LinkedList list = new LinkedList(); 
        Node testNode2 = new Node( 5, null );
        list.append( 5 );
        assertEquals( testNode2.value , list.root.value );
    }

    //list one element
    @Test
    public void testAppend1() {
        LinkedList list = new LinkedList(); 
        list.prepend( 5 );//root
        Node testNode1 = new Node( 5, new Node( 2, null ));
        list.append( 2 );
        //Node testNode2 = new Node( 5, new Node( 2, new Node( 3, null ) ));
        //list.append( 3 );
        assertEquals( testNode1.next.value, list.root.next.value);
        //assertEquals( testNode2.next.value, list.root.next.next.value);
    }
    /*
    @Test
    public void testAppend2() {
        LinkedList list = new LinkedList(); 
        Node dummy = new Node( 0, null);
        list.root = dummy;
        int[] values = new int[]{ 1, 2, 3 };
        for(int i = 0; i < values.length; i++) {
            dummy.next = new Node( values[i], null );
            dummy = dummy.next;
        }
        list.append( 4 );
        assertEquals( 4 , dummy.next.value);
    }
    */
}

