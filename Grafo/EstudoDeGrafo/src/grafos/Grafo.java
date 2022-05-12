package grafos;
public class Grafo {
    public static void main(String[] args) throws Exception {
        Matriz qualquer = new Matriz();
        qualquer.QuantidadeVertice();
        qualquer.ContaVertice();
        qualquer.inicializaMatriz(qualquer.MatrizAdj);
        qualquer.ConstruindoMatrizAdj();
        qualquer.imprimeMatrizAdj(qualquer.MatrizAdj);
    }
}
