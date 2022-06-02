package minggu14.praktikum1;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node(data);
        } else {
            Node current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean hasil = false;
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                hasil = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }

    void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del) {
        Node successor = del.right;
        Node successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
        }
        // find the node to be deleted
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        // delete the node
        if (current == null) {
            System.out.println("couldn't find the data!");
            return;
        } else {
            // if no child
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // if only right child
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { // if only left child
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { // if two children
                Node successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }

    /* Mulai penambahan kode untuk tugas */

    // Tugas no.1 : add with recursive
    void addRecursion(int data, Node node) {
        if (isEmpty()) {
            root = new Node(data);
        } else {
            if (data < node.data) {
                if (node.left != null) {
                    addRecursion(data, node.left);
                } else {
                    node.left = new Node(data);
                }
            } else if (data > node.data) {
                if (node.right != null) {
                    addRecursion(data, node.right);
                } else {
                    node.right = new Node(data);
                }
            }
        }
    }

    // Tugas no.2 : print data terkecil dan terbesar
    void printSmallestLargest() {
        if (!isEmpty()) {
            printSmallest(root);
            printLargest(root);
        }
    }

    void printSmallest(Node node) {
        if (node.left == null) {
            System.out.println("Smallest: " + node.data);
        } else {
            printSmallest(node.left);
        }
    }

    void printLargest(Node node) {
        if (node.right == null) {
            System.out.println("Largest: " + node.data);
        } else {
            printLargest(node.right);
        }
    }

    // Tugas no.3 : print setiap leaf
    void printLeaf() {
        if (!isEmpty()) {
            System.out.print("Leaf:");
            printLeaf(root);
            System.out.println();
        }
    }

    void printLeaf(Node node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(" " + node.data);
            } else {
                printLeaf(node.left);
                printLeaf(node.right);
            }
        }
    }

    // Tugas no.4 : print jumlah leaf
    void countLeaf() {
        if (!isEmpty()) {
            int leaves = countLeaf(root);
            System.out.println("Jumlah leaf: " + leaves);
        }
    }

    int countLeaf(Node current) {
        if (current != null) {
            if (current.left == null && current.right == null) {
                return 1;
            } else {
                int leavesOnLeft = 0, leavesOnRight = 0;
                leavesOnLeft += countLeaf(current.left);
                leavesOnRight += countLeaf(current.right);
                return leavesOnLeft + leavesOnRight;
            }
        } else {
            return 0;
        }
    }
}