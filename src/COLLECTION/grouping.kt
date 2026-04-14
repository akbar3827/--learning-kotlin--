package COLLECTION

/* grouping is operation to grouping the elements that exist in collection */

fun main() {
    val list = listOf("a", "a", "a", "b", "b", "c", "c", "d", "aa", "bb", "cc", "dd", "abc")
    val map: Map<String, List<String>> = list.groupBy { it.length.toString() }
    println(map) // {1=[a, a, a, b, b, c, c, d], 2=[aa, bb, cc, dd], 3=[abc]}
    val map2: Map<String, List<String>> = list.groupBy { it }
    println(map2) // {a=[a, a, a], b=[b, b], c=[c, c], d=[d], aa=[aa], bb=[bb], cc=[cc], dd=[dd], abc=[abc]}

    val grouping: Grouping<String, String> = list.groupingBy { it }
    println(grouping) // COLLECTION.GroupingKt$main$$inlined$groupingBy$1@378fd1ac

    println(grouping.eachCount())
    println(grouping.reduce { key, accumulator, element ->
            accumulator + "$element+$accumulator" // {a=aa+aa+aa+a, b=bb+b, c=cc+c, d=d, aa=aa, bb=bb, cc=cc, dd=dd, abc=abc}
    })
    println(grouping.fold(0) { accumulator, string ->
        accumulator + string.length //
    })
    println(grouping.aggregate { key, accumulator: String?, element, first ->
        if (first) "$element $element" else accumulator + element
    })
}