package solver;

import java.util.regex.Pattern;

import static java.lang.System.*;

public class Doc {

    private static String  aplicarFormatacao(String doc) {
        if (doc.length() == 11) {
            return doc.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        } else {
            return doc.replaceFirst("(\\d{2,3})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
        }
    }

    public static void main(String[] args) {
        out.println(aplicarFormatacao("39714145830"));
        out.println(aplicarFormatacao("45997418000153"));
    }
}
