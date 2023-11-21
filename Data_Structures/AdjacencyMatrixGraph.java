package Data_Structures;
import java.util.*;
public class AdjacencyMatrixGraph {
    int numOfVertices;
    int[][] graph;
    AdjacencyMatrixGraph(int numOfVertices){
        this.numOfVertices=numOfVertices;
        graph=new int[numOfVertices][numOfVertices];
    }
    public void addEdge(int i,int j){
        graph[i][j]=1;
    }
    public void removeEdge(int i,int j){
        graph[i][j]=0;
    }
    public void BFS(){

    }
}
