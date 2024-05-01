public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 1411.99;
        
        //Java é extremamente tipado, não esqueça!!
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //podemos colocar um cast ou mudar o tipo da variável

        /* as Constantes, são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada final, seguida do tipo.
        
        Por convenção, Constantes são sempre escritas em CAIXA ALTA.*/ 

        final int VALOR_DA_TAXA = 5;
    }
}
