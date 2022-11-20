
package assignmentDS3;
import java.util.*;


class Vertex // Each node has a label like A, B...
{
    public String label;
 
    // constructor
    public Vertex(String label)
    {
        this.label = label;
    }
}

public class Graph 
{
	private HashMap<Vertex, LinkedList<Vertex>> adj; // hash map with the key of node and value of neighbors type linked list

	// constructor
    public Graph() 
    {
    	adj = new HashMap<>();
    }
    
    // add node v2 to node v1
    public void addEdge(Vertex v1, Vertex v2)
    {
        LinkedList<Vertex> v1Adj = adj.get(v1); // pass the key which is v1 and get the value v2

        if (v1Adj == null) // if node hasn't gotten any neighbor yet
        	v1Adj = new LinkedList<>(); // create a new link list 
        
        v1Adj.add(v2); // add parameter v2 as a new neighbor of v1Adj
        adj.put(v1, v1Adj); // set v1 as a key and v1Adj as value in hashMap adj
    }
    
    public void neighbors(Vertex v1) 
    {
        LinkedList<Vertex> v1Adj = this.adj.get(v1);// pass the key which is v1 and get the value v2

        if (v1Adj != null) // if v1Adj has any neighbor
        {
    		for (Vertex neighbor : v1Adj)// read all neighbors of each node
                System.out.println("neighbor of vertex " + v1.label+ " : " + neighbor.label + " ");   
		} 
    } //End neighbors method
   
    public static void main(String[] args) 
	{
		
    	Graph graph = new Graph();
    	
    	// label nodes
    	Vertex a = new Vertex("A");
    	Vertex b = new Vertex("B");
    	Vertex c = new Vertex("C");
    	Vertex d = new Vertex("D");
    	Vertex e = new Vertex("E");
    	Vertex f = new Vertex("F");
    	Vertex g = new Vertex("G");
    	Vertex h = new Vertex("H");
    	Vertex i = new Vertex("I");
    	
    	// Add node v1 to v2
    	graph.addEdge(a,b);
		graph.addEdge(a,d);
		graph.addEdge(a,e);
		
		graph.addEdge(b,e);
		
		graph.addEdge(c,b);
		
		graph.addEdge(d,g);
		
		graph.addEdge(e,h);
		graph.addEdge(e,f);
		
		graph.addEdge(f,c);
		graph.addEdge(f,h);
		
		graph.addEdge(g,h);
		
		graph.addEdge(h,i);
		
		graph.addEdge(i,f);
		
       
        Vertex[] vertices = {a,b,c,d,e,f,g,h,i};
    	
    	for (int v = 0; v < vertices.length; v++) 
    	{
    		System.out.println();
    		Vertex currentVertex = vertices[v];
    		System.out.println(currentVertex.label);
    		graph.neighbors(currentVertex);
    	}
    		
		
		
		
	} // End main class
	
} //End Graph class
	
	



