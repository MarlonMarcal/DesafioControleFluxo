import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro : ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro : ");
        int parametroDois = terminal.nextInt();

        try {
            contador(parametroUm,parametroDois);
        } catch (ParametrosInvalidosException e) {
            
            System.out.println("Segundo parâmetro  menor que o primeiro: "+e);
        }

        terminal.close();
        
    }

    static void contador(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if(parametroDois < parametroUm){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {

            System.out.println("Imprimindo o numero "+ i);
            
        }
            

    }
}
