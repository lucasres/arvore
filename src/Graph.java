import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Graph  {
	private List<Node> nodes = new ArrayList<Node>();
	
	/**
	 * Add node in the list of node
	 * @param node
	 */
	public void addNode(Node node) {
		nodes.add(node);
	}
	
	/**
	 * Search in the list and return Node
	 * @param name
	 * @return
	 */
	public Node getNode(String name) {
		int i = 0;
		for(Node n:this.nodes) {
			if(n.getName().equals(name)) {
				return this.nodes.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Print the list of Adj
	 */
	public void printListAdj() {
		for(Node n:this.nodes) {
			System.out.println(n.getEdges());
		}
	}
	
	/**
	 * get grau of graph
	 */
	public void getGr4u() {
		List<Integer> graus = new ArrayList<Integer>();
		for(Node n:this.nodes) {
			graus.add(n.getGr4u());
		}
		Collections.sort(graus);
		
		System.out.print("Grau:");
		for(Integer i:graus) {
			System.out.print(i+",");
		}	
	}
	
}
