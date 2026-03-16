public class Main {
    public static void main(String[] args) {

        Grafo g1 = new Grafo();
        Grafo g2 = new Grafo();
        Grafo g3 = new Grafo();
        Grafo g4 = new Grafo();

        for (int i = 1; i <= 7; i++) {
            g1.adicionarVertice(i);
            g2.adicionarVertice(i);
            g3.adicionarVertice(i);
            g4.adicionarVertice(i);
        }

        for (int i = 1; i <= 6; i++) {
            g1.adicionarAresta(i, i + 1);
            g2.adicionarAresta(i, i + 1);
            g3.adicionarAresta(i, i + 1);
            g4.adicionarAresta(i, i + 1);
        }
        g1.adicionarAresta(7, 1);
        g2.adicionarAresta(7, 1);
        g3.adicionarAresta(7, 1);
        g4.adicionarAresta(7, 1);

        g1.adicionarAresta(1, 3);
        g1.adicionarAresta(1, 6);
        g1.adicionarAresta(2, 4);
        g1.adicionarAresta(2, 6);
        g1.adicionarAresta(3, 5);
        g1.adicionarAresta(4, 7);
        g1.adicionarAresta(5, 7);

        g2.adicionarAresta(1, 3);
        g2.adicionarAresta(1, 6);
        g2.adicionarAresta(2, 4);
        g2.adicionarAresta(2, 6);
        g2.adicionarAresta(4, 7);
        g2.adicionarAresta(5, 7);

        g3.adicionarAresta(1, 3);
        g3.adicionarAresta(1, 6);
        g3.adicionarAresta(5, 7);

        g4.adicionarAresta(1, 3);
        g4.adicionarAresta(1, 6);

        VerificadorEuleriano verificadorEul = new VerificadorEuleriano();

        imprimirAnaliseEuleriana("Grafo 1", g1, verificadorEul);
        imprimirAnaliseEuleriana("Grafo 2", g2, verificadorEul);
        imprimirAnaliseEuleriana("Grafo 3", g3, verificadorEul);
        imprimirAnaliseEuleriana("Grafo 4", g4, verificadorEul);
    }

    private static void imprimirAnaliseEuleriana(String nome, Grafo g, VerificadorEuleriano verificador) {
        System.out.println("\n" + nome);
        System.out.println("Ciclo Euleriano: " + (verificador.euleriano(g) ? "Possui" : "Não possui"));
        System.out.println("Caminho Euleriano (Semi): " + (verificador.semiEuleriano(g) ? "Possui" : "Não possui"));
    }
}