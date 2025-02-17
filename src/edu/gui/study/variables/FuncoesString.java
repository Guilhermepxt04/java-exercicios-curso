package edu.gui.study.variables;

public class FuncoesString {

    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG  ";

        String lower = original.toLowerCase();
        String upper = original.toUpperCase();
        String noEspaces = original.trim();
        String replace = original.replace("abcde", "ABCDE");
        String sub = original.substring(2, 9);
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.printf("%s original %n", original + "-");
        System.out.printf("%s minuscula %n", lower);
        System.out.printf("%s maiuscula %n", upper);
        System.out.printf("%s sem espaços %n", noEspaces + "-");
        System.out.printf("%s substituido %n", replace );
        System.out.printf("%s sub %n", sub);
        System.out.printf("%d index %n", i );
        System.out.printf("%d lastindex %n", j);

    }

}
