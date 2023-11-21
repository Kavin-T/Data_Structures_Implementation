package Data_Structures;
import java.util.*;
public class AdjacencyMatrixGraph {
    int numOfVertices;
    int[][] graph;
    public AdjacencyMatrixGraph(int numOfVertices){
        this.numOfVertices=numOfVertices;
        graph=new int[numOfVertices][numOfVertices];
    }
    public void addEdge(int i,int j){
        graph[i][j]=1;
    }
    public void removeEdge(int i,int j){
        graph[i][j]=0;
    }
    public void printRepresentation(){
        System.out.print("  ");
        for(int i=0;i<numOfVertices;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<numOfVertices;i++){
            System.out.print(i+" ");
            for(int j=0;j<numOfVertices;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void BFS(){
        boolean[] visited=new boolean[numOfVertices];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        ArrayList<Integer> res=new ArrayList<>();
        while (!queue.isEmpty()) {
            if(!visited[queue.peek()]){
                for(int j=0;j<numOfVertices;j++){
                    if(graph[queue.peek()][j]==1){
                        queue.add(j);
                    }
                }
                res.add(queue.peek());
                visited[queue.peek()]=true;    
            }
            queue.remove();
        }
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
