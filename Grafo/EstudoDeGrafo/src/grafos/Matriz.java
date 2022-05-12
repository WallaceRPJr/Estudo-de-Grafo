package grafos;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Matriz {
    Scanner in = new Scanner(System.in);
    
    int QtdeVertice;
    String [] vertice;
    int[][] MatrizDistancia;
    int[][] MatrizAdj;
     
 public void QuantidadeVertice(){
     System.out.println("DIGITE A QUANTIDADE DE VERTICE");
     int x = in.nextInt();
     x--;
     QtdeVertice = x;
     x++;
     vertice = new String [x];
     MatrizDistancia = new int [x][x];
     MatrizAdj = new int [x][x];
 }
 
    
    
    public void ContaVertice(){
        for (int i = 0; i <= QtdeVertice; i++) {
            System.out.println("DIGITE O VERTICE");
            String x = in.next();
            vertice[i] = x;
            System.out.println(vertice[i]);
        }
    }
     
    public void ConstruindoMatrizDistancia(){
       // MatrizDistancia = new int [QtdeVertice][QtdeVertice];
        
        this.inicializaMatriz(MatrizDistancia);
        
        for (int i = 0; i <= QtdeVertice; i++) {
            for (int j = 0; j <= QtdeVertice; j++) {
                System.out.println("QUAL A DISTANCIA ENTRE " + vertice[i] + " ENTRE " + vertice[j]);
                int distancia = in.nextInt();
                MatrizDistancia[i][j] = distancia;
            }
            
        }
    }
    
       public void ConstruindoMatrizAdj(){
       // MatrizAdj = new int [QtdeVertice][QtdeVertice];
           
       this.inicializaMatriz(MatrizAdj);
    
        for (int i = 0; i <= QtdeVertice; i++) {
            for (int j = 0; j <= QtdeVertice; j++) {
                System.out.println(vertice[i] + "É LIGADO AO VERTICE " + vertice[j] + " ?");
                int ligado = in.nextInt();
                MatrizAdj[i][j] = ligado;
            }
            
        }
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
                    System.out.println(vertice[i] + " - " + vertice[j] );
                }}}
        
    }
    
       public void imprimeMatrizDistancia(int [][] MatrizAdj){
        for (int i = 0; i < MatrizAdj.length; i++) {
            for (int j = 0; j < MatrizAdj[i].length; j++) {
                if (MatrizAdj [i][j] != 0) {
                    System.out.println(vertice[i] + " -> " + MatrizAdj [i][j] + " -> " + vertice[j] );
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
           //int ant = 0;
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
