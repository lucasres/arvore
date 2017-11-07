import java.util.List;
import java.util.ArrayList;

public class Node {
	private String name;
	private List<Edge> edges = new ArrayList<Edge>();
	
	/*
	 * Constructor of the class
	 * @parm String pName
	*/
	public Node(String pName){
		this.name = pName;
	}
	
	/*
	 * Get all egde
	 * @return Set
	*/
	public String getEdges(){
		String out = this.name + " =>";
		
		for(Edge ed : this.edges) {
			out = out + " " + ed.getDestiny().getName() + " , ";
		}
		
		return out;
	}
	
	/*
	 * Add egde 
	 * @return Boolean
	*/
	public boolean addEdge(Node pDestiny){
		addInDestiny(this, pDestiny);
		return edges.add(new Edge(this,pDestiny));
		
	}
	
	/**
	 * Build edge in destiny to source
	 * @param source
	 * @param destiny
	 */
	public void addInDestiny(Node source,Node destiny) {
		destiny.edges.add(new Edge(destiny, source));
	}
	
	/*
	 * Get name of the edge
	 * @return String 
	*/
	public String getName(){
		return this.name;
	}
	
	/**
	 * get grau of the node
	 * @return
	 */
	public int getGr4u() {
		return this.edges.size();
	}
	
	
	
}
