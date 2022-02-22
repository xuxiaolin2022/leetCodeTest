/**
 * 单链表翻转
 */
public class ReverseSingleList {

     static class Node{
        int i;
        Node next;

        public Node(int i, Node next) {
            this.i = i;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(5, null);
        for(int i = 4; i >= 1; i--){
            node = new Node(i, node);
        }
        print(node);
        //Node reverse = iterate(node);
        //print(reverse);
        Node reverse2 = recursion(node);
        print(reverse2);
    }

    private static void print(Node node) {
        while (node != null){
            System.out.print(node.i + " ");
            node = node.next;
        }
        System.out.println("");
        System.out.println("------");
    }

    public static Node iterate(Node node){
        Node prev = null,next;
        while (node != null){
             next = node.next;
             node.next = prev;
             prev = node;
             node = next;
        }
        return prev;
    }

    /**
     * 递归
     * @param node
     * @return
     */
    public static Node recursion(Node node){
        if(node == null || node.next == null){
            return node;
        }
        Node last = recursion(node.next);
        node.next.next = node;
        node.next = null;
        
        return last;
    }
}
