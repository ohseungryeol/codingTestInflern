package inflern;

 class Node{
        int data;
    Node lt,rt; //해당 노드에 왼쪽, 오른쪽 자식 노드
    public Node(int data){
        this.data= data;
        lt=rt=null;
    }
}

 class Tree {

    public static void main(String[] args) {
        Node root;
        root = new Node(1);
        root.lt = new Node(2);
        root.rt = new Node(3);
        root.lt.lt = new Node(4);
        root.lt.rt = new Node(5);
        root.rt.lt = new Node(6);
        root.rt.rt = new Node(7);
        DFS(root);
    }

    public static void DFS(Node node){
        if (node ==null) return;
        else {
            System.out.println(node.data);
            DFS(node.lt);
            DFS(node.rt);
        }
    }
}
