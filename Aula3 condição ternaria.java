public class Aula3condiçãoternaria {
    public static void main(String[] args){
        int nota=65;
        int media=60;
        int faltas=10;
        int maxFaltas=5;
        String res;
        res = (nota >= media ? "APROVADO" : "REPROVADO");

        System.out.println("Resultado:" +res);
    }
}
