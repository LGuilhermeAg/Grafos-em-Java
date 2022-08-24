import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
    Graph g1 = new Graph(4);
    System.out.println(g1);
    g1.addEdges(0, 1, 3);
    g1.addEdges(1, 0, 3);
    g1.addEdges(0, 3, 4);
    g1.addEdges(3, 0, 4);
    System.out.println(g1);
    Graph g2 = g1.complement();
    System.out.println(g2);
    System.out.println("Nó de maior grau: " + g1.highestNode() + " de grau " + g1.highestDegree());
    System.out.println("Menor grau: " + g1.lowestDegree());
    System.out.println("Densidade: " + g1.density() + "\n\n");

    String path = "graph.txt";
    Graph g3 = new Graph(path);
    System.out.println(g3);

    ArrayList<Integer> r = new ArrayList<>();
    r=g3.buscaProfundidade(0);
    System.out.println(r);
  }
}