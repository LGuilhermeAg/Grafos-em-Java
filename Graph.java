public class Graph {
  private int countNodes;
  private int countEdges;
  private int[][] adjMatrix;

  public Graph(int countNodes) {
    this.countNodes = countNodes;
    this.adjMatrix = new int[countNodes][countNodes];
  }

  public int getCountNodes() {
    return this.countNodes;
  }

  public int getCountEdges() {
    return this.countEdges;
  }

  public int[][] getAdjMatrix() {
    return this.adjMatrix;
  }

  public String toString() {
    String str = "";
    for (int i = 0; i < this.adjMatrix.length; i++) {
      for (int j = 0; j < this.adjMatrix[i].length; j++) {
        str += this.adjMatrix[i][j] + "\t";
      }
      str += "\n";
    }
    return str;
  }

  public void addEdges(int source, int sink, int weight) {
    if (source < 0 || source > this.countNodes - 1 ||
        sink < 0 || sink > this.countNodes - 1 ||
        weight <= 0) {
      System.err.println("Invalid edge: [" + source + "]->[" + sink + "] = " + weight);
      return;
    } else {
      this.adjMatrix[source][sink] = weight;
      this.countEdges++;
    }
  }

  public int degree(int node) {
    int countDegree = 0;
    if (node < 0 || node > this.countNodes - 1) {
      System.err.println("Invalid node: " + node);
    }
    for (int i = 0; i < this.countNodes; i++) {
      if (this.adjMatrix[node][i] != 0) {
        countDegree++;
      }
    }
    return countDegree;
  }

  public int highestNode() {
    int highestDegree = 0;
    int highestNode = 0;
    int degree = 0;
    for (int i = 0; i < this.adjMatrix.length; ++i) {
      degree = this.degree(i);
      if (degree > highestDegree) {
        highestDegree = degree;
        highestNode = i;
      }
    }
    return highestNode;
  }

  public int highestDegree() {
    int highestDegree = 0;
    int degree = 0;
    for (int i = 0; i < this.adjMatrix.length; ++i) {
      degree = this.degree(i);
      if (degree > highestDegree)
        highestDegree = degree;
    }
    return highestDegree;
  }

  public int lowestDegree() {
    int lowestDegree = this.countNodes;
    for (int i = 1; i < this.adjMatrix.length; ++i) {
      int degree = this.degree(i);
      if (degree < lowestDegree)
        lowestDegree = degree;
    }
    return lowestDegree;
  }

  public Graph complement() {
    Graph g = new Graph(this.countNodes);
    for (int i = 0; i < this.adjMatrix.length; i++) {
      for (int j = 0; j < this.adjMatrix[i].length; j++) {
        if (i != j) {
          if (this.adjMatrix[i][j] == 0) {
            g.addEdges(i, j, 1);
          }
        }
      }
    }
    return g;
  }

  // 15/8/22
  public float density() {
    float density;
    float edges = this.countEdges;
    float nodes = this.countNodes;
    density = (edges) / (nodes * (nodes - 1));
    return density;
  }

  public boolean subGraph(Graph g2) {

    if (g2.getCountNodes() > this.countNodes) {
      return false;
    }
    int[][] matriz = g2.getAdjMatrix();
    for (int i = 0; i < this.adjMatrix.length; i++) {
      for (int j = 0; j < this.adjMatrix[i].length; j++) {
        if (matriz[i][j] == 1 && this.adjMatrix[i][j] == 0) {
          return false;
        }
      }
    }
    return true;
  }

  /*
pseudocodigo busca por largura em grafos
maiusculo significa conjunto, minusculo valor||variavel
origem: breath-first search (BFS) - algoritmo

busca largura(g=(V, E), s){            //recebe um grafo representado como conjunto de vertices e arestas e um vertice origem 
  para cada v em V{                    //para cada vertice
    desc[v]=0                          //vetor binário de vértices descobertos ou não descobertos
    Q={s}                              //cria dois conjuntos com um elemento s(valor da origem): fila (FIFO) de nós a processar
    R={s}                              //ordem da descoberta (armazena a sequencia de nos processados)
    desc[s]=1                          //o nó origem foi descoberto
    enquanto q!=vazio{                 //Enquanto houver nós a processar
      u=remove primeiro elemento de Q  //remove o primeiro elemento da fila e salva em u (Q={} u=s)
      para cada v adjacente a u        //proximo nivel de nós adjacentes (conectados por arestas a u)
        se desc[v]=0{                  //novo elemento descoberto
          adcione v ao final de Q      //v é mais um elemento Q={v¹,v²,v³...}
          adcione v ao final de R      //v é mais um elemento processado R={s,v¹,v²,v³...}
          desc[v]=1                    //v foi descoberto
        }                
      }                                //retorna para o while processando a fila composta pelos elementos do proximo nivel 
    }
  }                                    //queue termina vazia, R termina cheio e desc termina com todas posicoes = 1
  retorna R                            //retorna a ordem de descoberta dos nós
}
*/

}