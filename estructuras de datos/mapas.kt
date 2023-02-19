fun main(){

val matematicasNotas =mutableMapOf("kebyn" to 3.0)

val menu="""
1.agregar nuevo estudiante
2.consultar nota de un estudiante
3.listado de estudiantes
4.eleiminar un estudiante
5.salir
"""
var opcion=0
do{
println(menu)
opcion=readLine()!!.toInt()

when(opcion){
    1->{

        println("ingrese el nombre del estudiante")
        var nombre=readLine()!!.toString()
        var validator=false
        if(matematicasNotas.contains(nombre)){
         validator=true
          while(validator==true){
               println("el estudiante ya existe por lo cual debera escribir su apellido o un codigo mas ")
            nombre=readLine()!!.toString()
             if(matematicasNotas.contains(nombre)){
         validator=true
        }else{
            validator=false
             println("ingrese la nota 1")
            var nota1=readLine()!!.toDouble()
            println("ingrese la nota 2")
            var nota2=readLine()!!.toDouble()
            println("ingrese la nota 3")
            var nota3=readLine()!!.toDouble()
            var notaF=(nota1+nota2+nota3)/3
            matematicasNotas[nombre]=notaF
        }
        } 
        }else{
        
            println("ingrese la nota 1")
            var nota1=readLine()!!.toDouble()
            println("ingrese la nota 2")
            var nota2=readLine()!!.toDouble()
            println("ingrese la nota 3")
            var nota3=readLine()!!.toDouble()
            var notaF=(nota1+nota2+nota3)/3
            matematicasNotas[nombre]=notaF
        }
    }
    2-> {
        println("ingrese el nombre del estudiante")
        var nom=readLine()!!.toString()
        if(matematicasNotas.contains(nom)){
            var valor=matematicasNotas[nom]
            println(valor)
        }else{
            println("el estudiante no se encuentra en el sistema")
        }


    }
    3->{

        println("estudiantes ${matematicasNotas.keys}")
    }
    4->{
         println("ingrese el nombre del estudiante")
        var nom=readLine()!!.toString()
        if(matematicasNotas.contains(nom)){
           matematicasNotas.remove(nom)
        }else{
            println("el estudiante no se encuentra en el sistema")
        }
    }
    else{ println("ingrese una opcion valida")}
}

}while(opcion!=5)

}