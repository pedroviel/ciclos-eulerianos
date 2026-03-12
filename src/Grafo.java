import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Grafo {

    private Map<Integer, Set<Integer>> adj = new HashMap<>();

    public void adicionarVertice(int v) {
        adj.putIfAbsent(v, new HashSet<>());
    }

    public void adicionarAresta(int v1, int v2) {
        adj.get(v1).add(v2);
        adj.get(v2).add(v1);
    }

    public int numeroVertices() {
        return adj.size();
    }

    public int grau(int v) {
        return adj.get(v).size();
    }

    public boolean saoAdjacentes(int v1, int v2) {
        return adj.get(v1).contains(v2);
    }

    public Set<Integer> vertices() {
        return adj.keySet();
    }
}