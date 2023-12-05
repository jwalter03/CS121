package weekFifteen.activity32;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.addNode('A');
        tree.addNode('B');
        tree.addNode('C');
        tree.addNode('D');
        tree.addNode('E');
        tree.addNode('F');
        tree.addNode('G');

        System.out.println("preorder traversal: ");
        tree.preOrderTraverse(tree.getRoot());
        System.out.println();

        System.out.println("inorder traversal: ");
        tree.inOrderTraverse(tree.getRoot());
        System.out.println();

        System.out.println("postorder traversal: ");
        tree.postOrderTraverse(tree.getRoot());
        System.out.println();

        System.out.println(tree.findNode('B'));
        System.out.println(tree.findNode('D'));
        System.out.println();

        System.out.println(tree.removeNode('E'));
        System.out.println("New inorder traversal: ");
        tree.inOrderTraverse((tree.getRoot()));


    }

}