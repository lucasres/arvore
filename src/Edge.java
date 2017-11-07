public class Edge {
	private Node source;
	private Node destiny;
	
	/*
	 * Constructor of the class
	 * @parm Node Source of edge
	 * @parm Node Destiny of edge
	 */
	public Edge(Node pSource, Node pDestiny){
		this.source = pSource;
		this.destiny = pDestiny;
	}
	
	/*
	 * Get Source of the edge
	 * @return Node 
	*/
	public Node getSource(){
		return this.source;
	}
	
	/*
	 * Get Destiny of the edge
	 * @return Node 
	*/
	public Node getDestiny(){
		return this.destiny;
	}
	
	/*
	 * Set Source of the edge
	*/
	public void setSource(Node pSource){
		this.source = pSource;
	}
	
	/*
	 * Set Destiny of the edge
	*/
	public void setDestiny(Node pDestiny){
		this.destiny = pDestiny;
	}
}
