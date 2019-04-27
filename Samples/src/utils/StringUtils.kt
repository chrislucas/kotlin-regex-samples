package utils





object StringUtils {
    private const val REGEX_SAMPLE_BRAZILIAN_NUMBER_CELLPHONE = "(\\d{2})(\\d{4,5})(\\d{4})"

    fun String.applyMaskInCellPhoneNumber(maskReplacement: String = "($1)$2-$3") : String =
            replace(Regex(REGEX_SAMPLE_BRAZILIAN_NUMBER_CELLPHONE), maskReplacement)
}