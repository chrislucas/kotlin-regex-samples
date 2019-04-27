
import utils.StringUtils.applyMaskInCellPhoneNumber


fun testApplyMaskCellphoneNumber() {
    println("11990013215".applyMaskInCellPhoneNumber())
    println("1188881234".applyMaskInCellPhoneNumber("($1) $2-$3"))
}


fun main(args: Array<String>) {
    testApplyMaskCellphoneNumber()
}