import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
    /*
     * Graph g1 = new Graph(4);
     * System.out.println("\nInicialização grafo g1: \n"+g1);
     * g1.addEdges(0, 1, 3);
     * g1.addEdges(1, 0, 3);
     * g1.addEdges(0, 3, 4);
     * g1.addEdges(3, 0, 4);
     * System.out.println("Grafo g1: \n"+g1);
     * Graph g2 = g1.complement();
     * System.out.println("Complemento do grafo g1: \n"+g2);
     * System.out.println("Nó de maior grau: " + g1.highestNode() + " de grau " +
     * g1.highestDegree());
     * System.out.println("Menor grau: " + g1.lowestDegree());
     * System.out.println("Densidade: " + g1.density() + "\n\n");
     * 
     * String path = "graph.txt";
     * Graph g3 = new Graph(path);
     * System.out.println("Grafo g3: \n"+g3);
     * 
     * if(g1.connected())
     * System.out.println("O grafo g1 é conectado");
     * else
     * System.out.println("O grafo g1 não é conectado");
     * 
     * ArrayList<Integer> r = new ArrayList<>();
     * r = g3.buscaLargura(0);
     * System.out.println("Busca por largura: "+r);
     * r = g3.buscaProfundidade(0);
     * System.out.println("Busca por profundidade: "+r);
     * r = g3.profundidadeRec(0);
     * System.out.println("Busca por profundidade recursiva: "+r+"\n");
     * if(g2.nonOriented())
     * System.out.println("O grafo g2 nao e orientado");
     * else
     * System.out.println("O grafo g2 e orientado");
     * if(g3.nonOriented())
     * System.out.println("O grafo g3 nao e orientado");
     * else
     * System.out.println("O grafo g3 e orientado");
     */
    /*
     * Graph g4 = new Graph(3);
     * System.out.println("\nInicialização grafo g4: \n"+g4);
     * g4.addEdges(0, 1, 1);
     * g4.addEdges(1, 2, 4);
     * g4.addEdges(2, 1, 3);
     * g4.addEdges(0, 2, 6);
     * System.out.print(g4);
     * g4.FloydWarshall();
     * Graph g5 = new Graph(4);
     * System.out.println("\nInicialização grafo g5: \n"+g5);
     * g5.addEdges(0, 2, 7);
     * g5.addEdges(0, 3, 6);
     * g5.addEdges(0, 1, -1);
     * g5.addEdges(1, 3, 0);
     * g5.addEdges(2, 0, 1);
     * g5.addEdges(2, 1, 4);
     * g5.addEdges(3, 2, -1);
     * System.out.print(g5);
     * g5.FloydWarshall();
     */
    Graph g1 = new Graph(3);
    g1.addEdge(0, 1, 10);
    g1.addEdge(0, 2, 20);
    g1.addEdge(2, 0, 15);
    System.out.println(g1);

    String path = "graph4.txt";
    Graph g2 = new Graph(path);
    System.out.println(g2);
    System.out.println(g2.complement());

    
  }
}