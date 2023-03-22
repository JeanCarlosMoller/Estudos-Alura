package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[5];

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

        /**
         * idades[0] = 29;
         * idades[1] = 39;
         * idades[2] = 49;
         * idades[3] = 59;
         * idades[4] = 69;
         * 
         * int idade1 = idades[0];
         * int idade2 = idades[1];
         * int idade3 = idades[2];
         * int idade4 = idades[3];
         * int idade5 = idades[4];
         * 
         * System.out.println(idade1);
         **/
    }

}
