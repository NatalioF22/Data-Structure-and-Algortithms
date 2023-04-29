import java.util.AbstractQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
       
        E = buildGraph();
        System.out.println("\n\nDFS (Iterative)\n---------------");
        boolean dfsIterFound = dfsIterative(E, targetData);

        E = buildGraph();
        System.out.println("\n\nDFS (Recursive)\n---------------");
        boolean dfsRecurFound = dfsRecursive(E, targetData);

        String output;
        output += dfsIterFound ? "DFS (iterative) found " + targetData + ".\n" : "DFS (iterative) didn't find " + targetData + ".\n";
        output += dfsRecurFound ? "DFS (recursive) found " + targetData + ".\n" : "DFS (recursive) didn't find " + targetData + ".\n";

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
    public static boolean dfsIterative(Node start, String targetData) {

        Stack<Node> stak = new Stack<>();
        stak.add(start);
        while(!stak.isEmpty()){
            Node nextNode = stak.pop();
            if(nextNode.data.equals(targetData)){
                return true;
            }
            else{
                nextNode.visit();
                for(Node neighbor:nextNode.neighbors ){
                    if(!neighbor.visited && stak.contains(neighbor)==false){
                        stak.push(neighbor);
                    }
                }
            }

        }
        return false;

    }
    public static boolean dfsRecursive(Node current, String targetData) {
        if (current.data.equals(targetData)){
            return true;
        }else{
            boolean found= false;
            current.visit();
            for(Node neighbor: current.neighbors){
                if (neighbor.visited==false) {
                    found = dfsRecursive(neighbor, targetData);
                }
                if(found==true){
                    return true;
                }
            }
            return false;
        }
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
