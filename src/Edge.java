
public class Edge {						//Edges(Kanten) stellen eine Verbindung zwischen zwei Knoten dar.
	public Vertex vertexStartingFrom;	//Startknoten
	public Vertex vertexLeadingTo;		//Zielknoten
	
	
	public Edge(Vertex vertexStartingFrom,Vertex vertexLeadingTo){ //Konstruktor mit den beiden Knoten als Parameter
		this.vertexStartingFrom=vertexStartingFrom;
		this.vertexLeadingTo=vertexLeadingTo;
		
	}

}
