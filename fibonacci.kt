fun main(args: Array<String>) {
    
    var intA = 0;
    var intB = 1;
    println(intA)
    println(intB)
    for (i in 1..20) {
    	var result = fibo(intA, intB)
        println(result)
        intA = intB;
        intB = result
	}
}

fun fibo(i:Int, j:Int):Int
{
    return i + j
}