import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String targetData = "C";
        Node E = buildGraph();
        System.out.println("BFS (Iterative)\n---------------");
        boolean bfsFound = bfs(E, targetData);

        String output = bfsFound ? "\nBFS found " + targetData + ".\n" : "\nBFS didn't find " + targetData + ".\n";

        System.out.println("\n\nRESULTS\n-------" + output);
    }
    public  static boolean bfs(Node start, String targetData){
        Queue<Node> queue = new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()){
            Node nextNode = queue.remove();
            if(nextNode.data.equals(targetData)){
                return true;
            }
            else{
                nextNode.visit();
                for(Node neighbor:nextNode.neighbors ){
                    if(!neighbor.visited && queue.contains(neighbor)==false){
                        queue.add(neighbor);
                    }
                }
            }

        }
        return false;

    }
    

    public static Node buildGraph() {
        //TODO: This method builds the graph shown in Graph Image.png in the project download. Do not modify.
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        Node G = new Node("G");
        Node H = new Node("H");
        Node I = new Node("I");
        A.neighbors = new Node[]{E};
        B.neighbors = new Node[]{C, E, F, I};
        C.neighbors = new Node[]{B};
        D.neighbors = new Node[]{F};
        E.neighbors = new Node[]{A, B, G};
        F.neighbors = new Node[]{B, D, H};
        G.neighbors = new Node[]{E};
        H.neighbors = new Node[]{F, I};
        I.neighbors = new Node[]{B, H};
        return E;
    }
}
