import java.util.Scanner;

public class Basico02{

   static Scanner leitor = new Scanner(System.in);

    public static int[] lerVetor(int tamanho){
        int[] vetor = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.println("Digite o número na posição "+ (i + 1) + ": ");
            vetor[i] = Integer.parseInt(leitor.nextLine());
        }
        return vetor;
    }

    static int definirTamanhoNovo(int tamanho){
        int novoTamanho = (tamanho/2) + (tamanho%2);
        return novoTamanho;
    }

    static void imprimir(int[] vetor, int tamanho){
        for (int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i] + " ");
        }       
    }

    static int[] somarVizinhosEmVetorDeInteiros(int[] vetor, int tamanhoOriginal){
        int tamanhoNovoVetor = definirTamanhoNovo(tamanhoOriginal);
        int ultimoValor = vetor[tamanhoOriginal - 1];

        int[] novoVetor = new int[tamanhoNovoVetor];

        for (int i = 0; i < tamanhoOriginal - 1; i += 2){
            novoVetor[i/2] = vetor[i] + vetor[i + 1];
        }
        
        if (tamanhoOriginal %2==1){
            novoVetor[tamanhoNovoVetor -1] = ultimoValor + ultimoValor;
        }
        return novoVetor;
    }

    public static void main(String[] args) throws Exception {
        int tamanhoOriginal;

        int[] inteiro;
        int[] somados;

        System.out.println("Qual será o tamanho do vetor?");
        tamanhoOriginal = Integer.parseInt(leitor.nextLine());
        inteiro = lerVetor(tamanhoOriginal);

        somados = somarVizinhosEmVetorDeInteiros(inteiro, tamanhoOriginal);

        System.out.println("\nVizinhos somados:\n");
        imprimir(somados, definirTamanhoNovo(tamanhoOriginal));
        System.out.println("\nFIM.\n");

        leitor.close();
        
    }
}