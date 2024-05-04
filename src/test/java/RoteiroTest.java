import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RoteiroTest {
    	
    private Rotator rotator = new Rotator();

    @Test
    public void testCase1() {
        BST bst = new BST();
        bst.add(10);
        bst.add(9);
        bst.add(8);
        bst.add(7);

        Node ten = bst.search(10);
        Node nine = bst.search(9);
        Node eight = bst.search(8);
        Node seven = bst.search(7);

        // rotação à direita no 9
        rotator.rotateRight(nine);

        // estado final do 10.
        assertNull(ten.getParent());
        assertNull(ten.getRight());
        assertEquals(8, ten.getLeft().getValue());


        // estado final do 9.
        assertEquals(8, nine.getParent().getValue());        
        assertTrue(nine.getLeft() == null && 
            nine.getRight() == null);

        // estado final do 8.
        assertEquals(10, eight.getParent().getValue());
        assertEquals(7, eight.getLeft().getValue());
        assertEquals(9, eight.getRight().getValue());
        
        // estado final do 7.
        assertEquals(8, seven.getParent().getValue());
        assertTrue(seven.getLeft() == null && 
            seven.getRight() == null);

        /*
        * Agora uma rotação à direita de um 
        * nó que tem esquerda completa
        */

        bst = new BST();
        bst.add(70);
        bst.add(99);
        bst.add(40);
        bst.add(60);
        bst.add(30);
        bst.add(10);
        bst.add(35);

        Node fourty = bst.search(40);
        Node thirty = bst.search(30);
        Node thirtyfive = bst.search(35);
        Node seventy = bst.search(70);

        rotator.rotateRight(fourty);

        // estado final do 40.
        assertEquals(30, fourty.getParent().getValue());
        assertEquals(35, fourty.getLeft().getValue());
        assertEquals(60, fourty.getRight().getValue());

        // estado final do 30.
        assertEquals(70, thirty.getParent().getValue());
        assertEquals(40, thirty.getRight().getValue());
        assertEquals(10, thirty.getLeft().getValue());

        // estado final do 35.
        assertEquals(40, thirtyfive.getParent().getValue());
        assertTrue(thirtyfive.getLeft() == null && 
            thirtyfive.getRight() == null);

        // estado final do 70.
        assertEquals(30, seventy.getLeft().getValue());
    }

    @Test
    public void testCase2() {
    	BST bst = new BST();
        bst.add(1);
        bst.add(2);
        bst.add(3);
        bst.add(4);

        Node one = bst.search(1);
        Node two = bst.search(2);
        Node three = bst.search(3);
        Node four = bst.search(4);

        // rotação à esquerda no 2
        rotator.rotateLeft(two);

        // estado final do 1.
        assertNull(one.getParent());
        assertNull(one.getLeft());
        assertEquals(3, one.getRight().getValue());

        // estado final do 2.
        assertEquals(3, two.getParent().getValue());        
        assertTrue(two.getLeft() == null && 
            two.getRight() == null);

        // estado final do 3.
        assertEquals(1, three.getParent().getValue());
        assertEquals(2, three.getLeft().getValue());
        assertEquals(4, three.getRight().getValue());
        
        // estado final do 4.
        assertEquals(3, four.getParent().getValue());
        assertTrue(four.getLeft() == null && 
            four.getRight() == null);

        /*
        * Agora uma rotação à esquerda de um 
        * nó que tem direita
        */

        bst = new BST();
        bst.add(55);
        bst.add(70);
        bst.add(90);
        bst.add(65);
        bst.add(25);
        bst.add(80);
        bst.add(99);

        Node fiftyfive = bst.search(55);
        Node seventy = bst.search(70);
        Node eighty = bst.search(80);
        Node ninety = bst.search(90);

        rotator.rotateLeft(seventy);

        // estado final do 70.
        assertEquals(90, seventy.getParent().getValue());
        assertEquals(80, seventy.getRight().getValue());
        assertEquals(65, seventy.getLeft().getValue());

        // estado final do 90.
        assertEquals(55, ninety.getParent().getValue());
        assertEquals(70, ninety.getLeft().getValue());
        assertEquals(99, ninety.getRight().getValue());

        // estado final do 80.
        assertEquals(70, eighty.getParent().getValue());
        assertTrue(eighty.getLeft() == null && 
            eighty.getRight() == null);

        // estado final do 55.
        assertEquals(90, fiftyfive.getRight().getValue());
        assertEquals(25, fiftyfive.getLeft().getValue());
    }

}
