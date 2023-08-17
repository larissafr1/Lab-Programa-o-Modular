import java.util.Scanner;

public class Basico04 {
    static Scanner leitor = new Scanner(System.in);

       static final int TAMANHO_MAX = 100;

        static String inverter(String frase){

            char [] vetor = frase.toCharArray();
            char letra;
            int tamanho = vetor.length;
                
            for(int i = 0; i < (tamanho / 2); i++){
                letra = vetor[i];
                vetor[i] = vetor[tamanho - i - 1];
                vetor[tamanho - i - 1] = letra;
            }
            return String.valueOf(vetor);
        }

        static String lerFrase(){
            System.out.println("Digite uma frase de até 100 caracteres ou 'fim' para terminar: ");
            String frase = leitor.nextLine();
            if(frase.length() > TAMANHO_MAX){
            return frase.substring(0, TAMANHO_MAX);
            }
            return frase;
        }

        public static void main(String[] args) throws Exception{
            String frase = lerFrase();

            while(!frase.equals("fim")){
                frase = inverter(frase);
                System.out.println("\nInvertida:\n" + frase);
                frase = lerFrase();
            }
    }

}