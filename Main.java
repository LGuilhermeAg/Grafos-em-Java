class Main {
  public static void main(String[] args) {
    Graph g1 = new Graph(4);
    System.out.println(g1);
    g1.addEdges(0, 1, 3);
    // System.out.println(g1);
    g1.addEdges(1, 0, 3);
    // System.out.println(g1);
    g1.addEdges(0, 3, 4);
    // System.out.println(g1);
    g1.addEdges(3, 0, 4);
    // System.out.println(g1);
    g1.addEdges(3, 4, 2);
    System.out.println(g1);
    System.out.println("Grau do nó 0: "+g1.degree(4));
  }
}