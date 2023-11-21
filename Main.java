import Data_Structures.*;
public class Main {
    public static void main(String[] args) {
        AdjacencyMatrixGraph g=new AdjacencyMatrixGraph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,0);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,0);
        g.addEdge(2,1);
        g.addEdge(2,4);
        g.addEdge(3,4);
        g.addEdge(3,1);
        g.addEdge(4,2);
        g.addEdge(4,3);
        g.printRepresentation();
        g.BFS();
    }
}
