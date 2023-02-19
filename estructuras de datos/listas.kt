fun main(){

var notas=mutableListOf<Float>();

for(i in 0 until 3 ) {
    println("ingrese la nota ${i+1}")
    var nota=readLine()!!.toFloat()
    notas.add(nota)
    
}
println(notas.size)
val menu="""
1.calcular promedio
2.mostrar si gano o perdio
3.volver a ingresar notas
4.salir
"""
var opcion=0
do{
println(menu)
opcion=readLine()!!.toInt()
when(opcion){
    1->{
        var promedio=0.0;
        for (i in notas) {
        promedio+=i
        }
        promedio=promedio/notas.size
         println("el promedio de las notas  es $promedio")
    }
    2->{
         var promedio=0.0;
        for (i in notas) {
        promedio+=i
        }
        promedio=promedio/notas.size
        if(promedio>=3.5){
            println("gano la materia")
        }else{
            println("perdio la materia")
        }
    }
    3->{
         notas.clear()
        for (i in 0 until 3) {
            println("ingrese la nota ${i+1}")
            var nota=readLine()!!.toFloat()
            notas.add(nota)
        }
    }
}

}while(opcion!=4)
}