
public class Main {
	public static void main(String[] args){
		//build all nodes
		Node no1 = new Node("A");
		Node no2 = new Node("B");
		Node no3 = new Node("C");
		Node no4 = new Node("D");
		Node no5 = new Node("E");
		Node no6 = new Node("F");
		Node no7 = new Node("H");
		
		
		//build all edges
		no1.addEdge(no2);
		no1.addEdge(no3);
		no2.addEdge(no4);
		no2.addEdge(no5);
		no5.addEdge(no6);
		no2.addEdge(no7);
		
		//build graph and add nodes
		Graph g = new Graph();
		g.addNode(no1);
		g.addNode(no2);
		g.addNode(no3);
		g.addNode(no4);
		g.addNode(no5);
		g.addNode(no6);
		g.addNode(no7);
		
		//print listAdj
		g.printListAdj();
		
		//print grau
		g.getGr4u();
		
		//print heigth of the tree
		System.out.println(g.getHeigth(no1,0));
		
		
		
		
	}
}
