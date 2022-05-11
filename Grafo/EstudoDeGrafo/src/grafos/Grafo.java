package grafos;
public class Grafo {
    public static void main(String[] args) throws Exception {
        Matriz qualquer = new Matriz();
        qualquer.QuantidadeVertice();
        qualquer.ContaVertice();
        qualquer.inicializaMatriz(qualquer.MatrizDistancia);
        qualquer.ConstruindoMatrizDistancia();
        qualquer.imprimeMatrizDistancia(qualquer.MatrizDistancia);
    }
}
