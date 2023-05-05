package entidade;

import java.util.Scanner;

public class Programa06 {
    
    private int A[];
    private int B[];
    private int C[];
    private int n;
    
    public Programa06(int n){
        A = new int [n];
        B = new int [n];
        C = new int [n];
        this.n = n;
    }
    
    public void lerVetores(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite os elementos do vetor A: ");
        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        
        System.out.println("Digite os elementos do vetor B: ");
        for(int i = 0; i < B.length; i++){
            B[i] = sc.nextInt();
        }
        
        sc.close();
    }
    
    public void somaVetores() {
        for(int i = 0; i < C.length; i++){
            C[i] = A[i] + B[i];
        }
    }
    
    public void imprimirC() {
        System.out.println("Vetor Resultante: ");
        for(int i=0; i<n; i++){
            System.out.println(C[i] + " ");
        }
        System.out.println();
    }
}