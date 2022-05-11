package grafos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Matriz {
    Scanner in = new Scanner(System.in);
    
    int QtdeVertice;
    public LinkedList<String> vertice;
    //String [] vertice = new String [QtdeVertice];
    int[][] MatrizDistancia;
    int[][] MatrizAdj;
     
 public void QuantidadeVertice(){
     System.out.println("DIGITE A QUANTIDADE DE VERTICE");
     int x = in.nextInt();
     x--;
     QtdeVertice = x;
 }
 
    
    
    public void ContaVertice(){
        for (int i = 0; i <= QtdeVertice; i++) {
            System.out.println("DIGITE O VERTICE");
            String x = in.next();
            vertice.add(x);
        }
    }
     
    public void ConstruindoMatrizDistancia(){
        int [][] MatrizTemp = new int [QtdeVertice][QtdeVertice];
        
        this.inicializaMatriz(MatrizTemp);
        
        for (int i = 0; i <= QtdeVertice; i++) {
            for (int j = 0; j <= QtdeVertice; j++) {
                System.out.println("QUAL A DISTANCIA ENTRE " + vertice.get(i) + " ENTRE " + vertice.get(j));
                int distancia = in.nextInt();
                MatrizTemp[i][j] = distancia;
            }
            
        }
        MatrizDistancia = MatrizTemp;
    }
    
       public void ConstruindoMatrizAdj(){
        int [][] MatrizTemp = new int [QtdeVertice][QtdeVertice];
           
       this.inicializaMatriz(MatrizTemp);
    
        for (int i = 0; i <= QtdeVertice; i++) {
            for (int j = 0; j <= QtdeVertice; j++) {
                System.out.println(vertice.get(i) + "É LIGADO AO VERTICE " + vertice.get(j) + " ?");
                int ligado = in.nextInt();
                MatrizTemp[i][j] = ligado;
            }
            
        }
        MatrizAdj = MatrizTemp;
    }
    
    public void inicializaMatriz(int[][] Matriz){
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                Matriz[i][j] = 0;
            }
        }
    }
    
    public void imprimeMatrizAdj(int [][] MatrizAdj){
        for (int i = 0; i < MatrizAdj.length; i++) {
            for (int j = 0; j < MatrizAdj[i].length; j++) {
                if (MatrizAdj [i][j] != 0) {
                    System.out.println(vertice.get(i) + " - " + vertice.get(j) );
                }}}
        
    }
    
       public void imprimeMatrizDistancia(int [][] MatrizAdj){
        for (int i = 0; i < MatrizAdj.length; i++) {
            for (int j = 0; j < MatrizAdj[i].length; j++) {
                if (MatrizAdj [i][j] != 0) {
                    System.out.println(vertice.get(i) + " -> " + MatrizAdj [i][j] + " -> " + vertice.get(j) );
                }}}
        
    }
     
       public void MenorDist(int numVertice, int[][] MatrizAdj, int [][] MatrizDist){
           int numVertic = 1; // Vertice inicial
           
           int[] dt = new int [numVertic];
           int[] antecessor = new int [numVertic];
           Queue<Integer> a = new LinkedList<Integer>();
           Queue<Integer> f = new LinkedList<Integer>();
           
           dt[0] = 0;
           antecessor[0] = 0;
           int ant = 0;
           for (int i = 1; i < numVertic; i++) {
               dt[i] = MatrizDist[0][i];
               antecessor[i] = 0;
               a.add(i);
           }
           f.add(0);
           while(f.size() != numVertic){
               
               
               
           }
           
           
           
       }
    
 
}
