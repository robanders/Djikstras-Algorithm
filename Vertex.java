package A6_Dijkstra;

import java.util.LinkedList;
import java.util.List;

public class Vertex {
	
	private long idNum;
	private String label;
	private long inDegree;
	private long topoInDegree;
	
	public boolean processed;
	public long sp;
	public Vertex prevVertex;
	
	List<Edge> edgeList = new LinkedList<Edge>(); //outgoing edge list
	List<Edge> inEdgeList = new LinkedList<Edge>();
	
	public Vertex(long idNum, String label){
		this.idNum = idNum;
		this.label = label;
		inDegree = 0;
		processed = false;
		sp = 9999999;
		prevVertex = null;
	}
	
	public long getidNum(){
		return idNum;
	}
	
	public String getlabel(){
		return label;
	}
	
	public long getinDegree(){
		return inDegree;
	}
	
	public long getTopoInDegree(){
		return topoInDegree;
	}
	
	public List<Edge> getEdgeList(){
		return edgeList; 
	}
	
	public void addEdge(Edge newEdge){
		edgeList.add(newEdge);
		return;
	}
	
	public void addInEdge(Edge newEdge){
		inEdgeList.add(newEdge);
		return;
	}
	
	public long incrementInDegree(){
		return inDegree++;
	}
	
	public long decrementInDegree(){
		return inDegree--;
	}
	
	public long decrementtopoInDegree(){
		return topoInDegree--;
	}
	
	public void reset(){
		topoInDegree = inDegree;
	}
}
