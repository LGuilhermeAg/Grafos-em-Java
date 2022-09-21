import java.util.ArrayList;

public class Graph {

  private int countNodes;
  private int countEdges;
  private ArrayList<ArrayList<Edge>> adjList;

  public Graph(int countNodes) {
    this.countNodes = countNodes;
    adjList = new ArrayList<>(this.countNodes);
    for (int i = 0; i < this.countNodes; ++i) {
      adjList.add(new ArrayList<Edge>());
    }
  }

  public void addEdge(int source, int sink, int weight) {
    if (source < 0 || source > this.countNodes - 1 ||
        sink < 0 || sink > this.countNodes - 1 ||
        weight <= 0) {
      System.err.println("Invalid edge: [" + source + "]->[" + sink + "] = " + weight);
      return;
    } else {
      adjList.get(source).add(new Edge(source, sink, weight));
      this.countEdges++;
    }
  }

  public void addEdgeUnoriented(int source, int sink, int weight) {
    addEdge(source, sink, weight);
    addEdge(sink, source, weight);
  }

  public String toString() {
    String str = "";
    for (int i = 0; i < this.adjList.size(); ++i) {
      str += i + ": ";
      for (int j = 0; j < this.adjList.get(i).size(); ++j) {
        str += this.adjList.get(i).get(j) + "\t";
      }
      str += "\n";
    }
    return str;
  }

  public int getCountNodes() {
    return countNodes;
  }

  public void setCountNodes(int countNodes) {
    this.countNodes = countNodes;
  }

  public int getCountEdges() {
    return countEdges;
  }

  public void setCountEdges(int countEdges) {
    this.countEdges = countEdges;
  }

  public ArrayList<ArrayList<Edge>> getAdjList() {
    return adjList;
  }

  public void setAdjList(ArrayList<ArrayList<Edge>> adjList) {
    this.adjList = adjList;
  }

}