
public class Main {
	public static void main(String[] args){
		//build all nodes
		Node no1 = new Node("A");
		Node no2 = new Node("B");
		Node no3 = new Node("C");
		Node no4 = new Node("D");
		
		//build all edges
		no1.addEdge(no2);
		no2.addEdge(no3);
		no3.addEdge(no4);
		
		//build graph and add nodes
		Graph g = new Graph();
		g.addNode(no1);
		g.addNode(no2);
		g.addNode(no3);
		g.addNode(no4);
		
		//print listAdj
		g.printListAdj();
		
		//print grau
		g.getGr4u();
		
		
		
		
		
		
	}
}
