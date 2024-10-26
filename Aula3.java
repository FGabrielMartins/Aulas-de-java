public class Aula3 {
    public static void main(String[] args){

        // ==(igual) >(Maior que) <(menor que) >=(maior igual) <=(menor igual) !=(diferente) !(negação) &&(e)
        //if
        //if...else
        //?
        //switch
        int nota=65;
        int media=60;
        int faltas=10;
        int maxFaltas=5;

        //Tabela verdade do and &&
        /*
            verdadeiro com verdadeiro = verdadeiro
            verdadeiro com falso = falso
            falso com verdadeir0 = falso
            falso com falso = falso 
         */
        //Tabela or ||
        /*
            verdadeiro com verdadeiro = verdadeiro
            verdadeiro com falso = verdadeiro
            falso com verdadeir0 = verdadeiro
            falso com falso = falso 
         */

        if ((nota >= media) && (faltas <= maxFaltas)){ 
            System.out.println("APROVADO");
        }else if (nota>=40) {
            System.out.println("RECUPERAÇÃO");
        }   
        else{
            System.out.println("REPROVADO");
        }
        System.out.println("Fim do Programa");
    }
}