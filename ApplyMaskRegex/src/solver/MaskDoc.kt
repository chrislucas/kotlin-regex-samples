package solver

private val patternCPF = Regex("(\\d{3}\\.){2}(\\d{3})-(\\d{2})")

private val patternCNPJ = Regex("(\\d{2,3}\\.){2}(\\d{3})/(\\d{4})-(\\d{2})")

fun aplicarFormatacao(doc: String): String {
    return if (doc.length == 11) {
        doc.replace("(\\d{3})(\\d{3})(\\d{3})(\\d{2})".toRegex(), "$1.$2.$3-$4")
    } else {
        doc.replace("(\\d{2,3})(\\d{3})(\\d{3})(\\d{4})(\\d{2})".toRegex(), "$1.$2.$3/$4-$5")
    }
}

fun main(args: Array<String>) {
    println(aplicarFormatacao("39714145830"))
    println(aplicarFormatacao("45997418000153"))
}