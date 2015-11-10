import java.util.LinkedList;


public class Vertex {
	public int vertexName;		// speichert den Namen eines Knotens
	public LinkedList<Edge> adjList;	//Jeder Knoten besitzt eine Adjacency List, 
										//also eine LinkedList von all seinen umliegenden Nachbarn
										//(indirekt, da die LinkedLists die benachbarten Kanten (Edges)
										//enthalten, womit man die Nachbarn herleiten kann)
	
	
	public Vertex(int vertexName){		//Dies ist der Konstruktor, dem nur der Knotenname übergeben wird
		this.vertexName=vertexName;
		adjList=new LinkedList<Edge>();
	}
	
	
	
}
