fun main(){
    val numbers=FloatArray(3)
    var promedio=0.0


    for( i in 0 until numbers.size){
       println("ingrese la nota ${i+1}:")
       numbers[i]=readLine()!!.toFloat()
    }

    for(i in 0 until numbers.size){
        promedio +=numbers[i]

    }
    promedio=promedio/numbers.size
    if(promedio>=3.5){
        println("gano la materia")
    }else{
        println("perdio la materia")
    }
    println("nota final: $promedio")

}