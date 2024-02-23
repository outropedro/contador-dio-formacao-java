import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = teclado.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = teclado.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
        if (parametroDois < parametroUm) {
            System.out.println("O segundo parametro deve ser maior que  primeiro");
        }
		
		int contagem = parametroDois - parametroUm;
		
        for (int i = 1; i < contagem; i++) {
            System.out.println(i);
        }
	}
}