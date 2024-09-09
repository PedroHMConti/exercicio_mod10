import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();
        double nota4 = sc.nextDouble();
        double media = 0;
        media = (nota1 + nota2 + nota3 + nota4)/4;
        if(media>=7){
            System.out.println("Aluno aprovado");
        }else if(media>=5){
            System.out.println("Aluno de recuperação");
        }else{
            System.out.println("Aluno Reprovado");
        }
    }
}
