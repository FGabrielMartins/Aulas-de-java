import java.util.Scanner;

public class Aula4ClasseScanner {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int n1=0,n2=0,n3=0,n4=0,Soma=0;
        //A palavra final representa uma constante.
        final int media, res;
        String nome ="";

        System.out.print("Digite o nome do aluno:");
        nome=scan.nextLine();
        System.out.print("Digite a n1:");
        n1=scan.nextInt();
        System.out.print("Digite a n2:");
        n2=scan.nextInt();
        System.out.print("Digite a n3:");
        n3=scan.nextInt();
        System.out.print("Digite a n4:");
        n4=scan.nextInt();

        Soma=n1+n2+n3+n4;
        media=Soma/4;
        
        System.out.printf("Aluno:%s\nA soma das suas notas %d + %d + %d + %d\nÉ igual a: %d\nMédia: %d",nome,n1,n2,n3,n4,Soma,media);
        if (media>=7) {
            
            System.out.println("\nAprovado");
        }else{
            System.out.println("\nReprovado");
        }
        }
    }