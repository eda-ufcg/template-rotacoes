public class RoteiroTest {

    private Rotator rotator = new Rotator();

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
        assert ten.getParent() == null;
        assert ten.getRight() == null;
        assert ten.getLeft().getValue() == 8;

        // estado final do 9.
        assert nine.getParent().getValue() == 8;
        assert nine.getLeft() == null && nine.getRight() == null;

        // estado final do 8.
        assert eight.getParent().getValue() == 10;
        assert eight.getLeft().getValue() == 7;
        assert eight.getRight().getValue() == 9;

        // estado final do 7.
        assert seven.getParent().getValue() == 8;
        assert seven.getLeft() == null && seven.getRight() == null;

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
        assert fourty.getParent().getValue() == 30;
        assert fourty.getLeft().getValue() == 35;
        assert fourty.getRight().getValue() == 60;

        // estado final do 30.
        assert thirty.getParent().getValue() == 70;
        assert thirty.getRight().getValue() == 40;
        assert thirty.getLeft().getValue() == 10;

        // estado final do 35.
        assert thirtyfive.getParent().getValue() == 40;
        assert thirtyfive.getLeft() == null && thirtyfive.getRight() == null;

        // estado final do 70.
        assert seventy.getLeft().getValue() == 30;
    }

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
        assert one.getParent() == null;
        assert one.getLeft() == null;
        assert one.getRight().getValue() == 3;

        // estado final do 2.
        assert two.getParent().getValue() == 3;
        assert two.getLeft() == null && two.getRight() == null;

        // estado final do 3.
        assert three.getParent().getValue() == 1;
        assert three.getLeft().getValue() == 2;
        assert three.getRight().getValue() == 4;

        // estado final do 4.
        assert four.getParent().getValue() == 3;
        assert four.getLeft() == null && four.getRight() == null;

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
        assert seventy.getParent().getValue() == 90;
        assert seventy.getRight().getValue() == 80;
        assert seventy.getLeft().getValue() == 65;

        // estado final do 90.
        assert ninety.getParent().getValue() == 55;
        assert ninety.getLeft().getValue() == 70;
        assert ninety.getRight().getValue() == 99;

        // estado final do 80.
        assert eighty.getParent().getValue() == 70;
        assert eighty.getLeft() == null && eighty.getRight() == null;

        // estado final do 55.
        assert fiftyfive.getRight().getValue() == 90;
        assert fiftyfive.getLeft().getValue() == 25;
    }

    public static void main(String[] args) {
        boolean assertsEnabled = false;
        assert assertsEnabled = true;
        if (!assertsEnabled) {
            System.err.println("Execute com -ea para habilitar os asserts: java -ea -cp src/main/java RoteiroTest");
            System.exit(1);
        }

        RoteiroTest test = new RoteiroTest();
        test.testCase1();
        test.testCase2();
        System.out.println("Todos os asserts passaram!");
    }

}
