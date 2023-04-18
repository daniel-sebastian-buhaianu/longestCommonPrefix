fun main() {
    println(longestCommonPrefix(
        arrayOf("car", "carbon", "carsekzosp")
    ))
}

fun longestCommonPrefix(strs: Array<String>): String {
    // sort array of strings lexicographically in ascending order
    strs.sort()

    // find the longest common prefix of the first and last string in strs
    // because that is the final result
    val firstStr = strs[0]
    val lastStr = strs[strs.lastIndex]
    var result = ""
    var i = 0
    while (i < firstStr.length) {
        if (firstStr[i] == lastStr[i]) {
            result += firstStr[i]
        } else {
            break;
        }
        i++
    }
    
    return result
}