import java.util.LinkedList;


public class Graph {
	public Vertex[] vertexList;		//Struktur des Graphen: Eine ArrayList speichert alle Knoten des Graphen
									//Jeder Knoten besitzt eine AdjacencyList in Form von einer LinkedList.
	
	public Graph(int numberOfVertex){
		vertexList=new Vertex[numberOfVertex];	//Im Konstruktor wird festgelegt wie viele Knoten der Graph haben soll.
		for(int i=0;i<numberOfVertex;i++){
			vertexList[i]=new Vertex(i+1);		//Knoten werden erstellt, haben jedoch noch eine leere AdjacencyList.
		}
	}
	//In der Main-Methode setzen wir uns den gewünschten Graphen zusammen 
	//und führen die benötigten Methoden aus
	public static void main(String[] args) {
		
		Graph gr = new Graph(5);
		gr.addEdge(new Vertex(1), new Vertex(2));
		gr.addEdge(new Vertex(1), new Vertex(5));
		gr.addEdge(new Vertex(2), new Vertex(1));
		gr.addEdge(new Vertex(2), new Vertex(5));
		gr.addEdge(new Vertex(2), new Vertex(3));
		gr.addEdge(new Vertex(2), new Vertex(4));
		gr.addEdge(new Vertex(3), new Vertex(2));
		gr.addEdge(new Vertex(3), new Vertex(4));
		gr.addEdge(new Vertex(4), new Vertex(2));
		gr.addEdge(new Vertex(4), new Vertex(5));
		gr.addEdge(new Vertex(4), new Vertex(3));
		gr.addEdge(new Vertex(5), new Vertex(4));
		gr.addEdge(new Vertex(5), new Vertex(1));
		gr.addEdge(new Vertex(5), new Vertex(2));
		gr.printGraph();
	}
	// Mit der Methode addEdge fügen wir einem Knoten eine benachbarte Kante(Edge) ein.
	public void addEdge(Vertex vertexStartingFrom, Vertex vertexLeadingTo){

		vertexList[vertexStartingFrom.vertexName-1].adjList.addLast(new Edge(vertexStartingFrom, vertexLeadingTo));																					
	}
	
	public void printGraph(){
		String str="";						//String Concatenation
		for(int i=0;i<vertexList.length;i++){ //Für jeden Knoten in der vertexList tue folgendes.
			str+=(i+1)+":";
			LinkedList<Edge> temp=vertexList[i].adjList;	//Greife auf seine AdjacencyList zu
			for(Edge e:temp){								//Nimm für jede Edge in der AdjacencyList nur den Zielknoten
				str+="-->"+e.vertexLeadingTo.vertexName+";";//und füge sie dem String hinzu.
			}
			System.out.println(str);						//Ausgabe des Strings: Knoten mit all seinen umliegenden Nachbarn
			str="";											//String muss wieder zurückgesetzt werden, sonst werden sie mehrmals
															//in der Konsole ausgegeben.
		}
	}
}
