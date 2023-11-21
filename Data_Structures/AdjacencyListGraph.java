package Data_Structures;
import java.util.*;
public class AdjacencyListGraph {
    int numOfVertices;
    LinkedList<Integer>[] graph;
    public AdjacencyListGraph(int numOfVertices){
        this.numOfVertices=numOfVertices;
        graph=new LinkedList[numOfVertices];
        for(int i=0;i<numOfVertices;i++){
            graph[i]=new LinkedList<Integer>();
        }
    }
    public void addEdge(int i,int j){
        graph[i].add(j);
    }
    public void removeEdge(int i,int j){
        graph[i].remove(j);
    }
    public void printRepresentation(){
        for(int i=0;i<numOfVertices;i++){
            System.out.print(i+"->");
            for(int j=0;j<graph[i].size();j++){
                System.out.print(graph[i].get(j)+" ");
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
                for(int j=0;j<graph[queue.peek()].size();j++){
                    queue.add((int)graph[queue.peek()].get(j));
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
