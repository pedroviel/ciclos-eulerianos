import java.util.HashSet;
import java.util.Set;

public class VerificadorEuleriano {

    public boolean euleriano(Grafo g) {
        if (!ehConexo(g)) {
            return false;
        }

        for (int v : g.vertices()) {
            if (g.grau(v) % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean semiEuleriano(Grafo g) {
        if (!ehConexo(g)) {
            return false;
        }

        int impares = 0;
        for (int v : g.vertices()) {
            if (g.grau(v) % 2 != 0) {
                impares++;
            }
        }
        return impares == 2;
    }

    private boolean ehConexo(Grafo g) {
        int n = g.numeroVertices();
        if (n == 0) return true;

        int verticeInicial = -1;

        for (int v : g.vertices()) {
            if (g.grau(v) > 0) {
                verticeInicial = v;
                break;
            }
        }

        if (verticeInicial == -1) return true;

        Set<Integer> visitados = new HashSet<>();
        buscaEmProfundiade(g, verticeInicial, visitados);

        for (int v : g.vertices()) {
            if (g.grau(v) > 0 && !visitados.contains(v)) {
                return false;
            }
        }
        return true;
    }

    private void buscaEmProfundiade(Grafo g, int v, Set<Integer> visitados) {
        visitados.add(v);
        for (int u : g.vertices()) {
            if (g.saoAdjacentes(v, u) && !visitados.contains(u)) {
                buscaEmProfundiade(g, u, visitados);
            }
        }
    }
}