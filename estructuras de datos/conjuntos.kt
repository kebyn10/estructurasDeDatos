fun main() {

var usuarios=setOf("kebyn","juan","tulio");

do{
println("ingrese el nombre a consultar")
var nombre=readLine()!!.toString()

if(usuarios.contains(nombre)){
    println("$nombre si se encuentra en el sistema")
    
}else{
    println("no se encuentra en el sistema")
}

println("ingrese 'si' si desea volver a ejecutar el programa o 'no' para parar la ejecucion ")
var opcion=readLine()!!.toString()
}while(opcion=="si" || opcion=="Si" || opcion=="SI")


}