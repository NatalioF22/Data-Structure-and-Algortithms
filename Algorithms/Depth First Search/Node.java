public class Node {
    //TODO: This class definition is being given in completed format to allow the focus to be on BFS/DFS.
    String data;
    boolean visited;
    Node[] neighbors;

    public Node (String data){
        this.data = data;
    }

    public void visit() {
        System.out.print(data + ", ");
        visited = true;
    }


}