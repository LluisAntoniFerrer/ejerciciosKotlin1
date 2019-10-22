fun main(){
    //actividad1(3999);
    //actividad2();
    //actividad3();
    //actividad4();
    actividad5();
    //actividad6();
    //actividad7();
    //actividad8();
    //actividad9();
    //actividad10()
    //actividad11();
}

//convertidor de numeros en numeros romanos
fun actividad1(input:Int){
    if (input < 1 || input > 3999) {
        println("Invalid Roman Number Value");
    }else {
        var s = ""
        var num = input;
        while (num >= 1000) {
            s += "M"
            num -= 1000
        }
        while (num >= 900) {
            s += "CM"
            num -= 900
        }
        while (num >= 500) {
            s += "D"
            num -= 500
        }
        while (num >= 400) {
            s += "CD"
            num -= 400
        }
        while (num >= 100) {
            s += "C"
            num -= 100
        }
        while (num >= 90) {
            s += "XC"
            num -= 90
        }
        while (num >= 50) {
            s += "L"
            num -= 50
        }
        while (num >= 40) {
            s += "XL"
            num -= 40
        }
        while (num >= 10) {
            s += "X"
            num -= 10
        }
        while (num >= 9) {
            s += "IX"
            num -= 9
        }
        while (num >= 5) {
            s += "V"
            num -= 5
        }
        while (num >= 4) {
            s += "IV"
            num -= 4
        }
        while (num >= 1) {
            s += "I"
            num -= 1
        }
        println(s);
    }
}
//convertidor de kb en MB
fun actividad2(){
    println("Introduzca un numero de Kb para traducir a MB");
    val num = readLine()!!.toFloat();
    var result = (num/1024).toFloat();
    println("$num kb son $result MB");
}

//Escriba un programa que calcule la media de N numéro enteros introducidos.
fun actividad3(){
    println("Introduzca un cuantos numeros quieres calcular");
    val num = readLine()!!.toInt();
    var numeros: Int = 0;
    println("Introduzca $num numeros");
    for (i in 1..num){
        val n = readLine()!!.toInt();
        numeros += n;
    }
    numeros /= num;
    println("La media de los $num numeros es $numeros")
}

//Cree un programa que a partir de un entero calcule su serie Fibonacci

fun actividad4(){

    println("De que numero quieres sacar la serie Fibonacci?");
    val num = readLine()!!.toInt();
    var a=0;
    var b=1
    var c =0;
    println("La serie fibonacci de $num es : ");
    for(i in 1..num){
        c=a;
        a+=b;
        b=c;
        print("$b, ");
    }
}
//Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince (15 filas)
fun actividad5(){
 for (i in 1..14){
     if(i == 1){
         print("               Apuesta1    Apuesta2    Apuesta3")
         println();
     }
     print("Partido $i")
     if (i<10) print(" ")
     for (x in 1..3){
         print("     [1 X 2]")
     }
     println();
 }
    print("Pleno al 15    Equipo1  [0 1 2 M]    Equipo2  [0 1 2 M]")

}
//Realizar la carga de la cantidad de hijos de 10 familias. Contar cuantos tienen 0,1,2 o más hijos. Imprimir dichos contadores.
fun actividad6(){
    println("Introduzca los hijos que tienen 10 familias");
    var cont0= 0;
    var cont1= 0;
    var cont2= 0;
    var contMas= 0;
    for (i in 1..10){
        val n = readLine()!!.toInt();

        when (n){
            0 -> cont0++;
            1 -> cont1 ++;
            3 -> cont2++;
            else -> {
                contMas ++
            }
        }
    }
    println("$cont0 familias no tienen hijos.");
    println("$cont1 familias tienen 1 hijo.");
    println("$cont2 familias tienen 2 hijos.");
    println("$contMas familias tienen mas de 2 hijos.");
}
//Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
fun actividad7(){
    println("Introduzca 10 notas de los alumnos");
    var notables= 0;
    var menosDeNotable= 0;
    for (i in 1..10){
        val n: Int = readLine()!!.toInt();

        when {
           n<7 -> menosDeNotable++;
            else -> {
                notables ++
            }
        }
    }
    println("Hay $notables alumnos con notable o mas" );
    println("Hay $menosDeNotable alumnos con menos notable");
}
//Realizar un programa que permita cargar dos listas de 5 valores cada una. Informar con un mensaje cual de las dos listas
// tiene un valor acumulado mayor (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales") Tener en cuenta que puede
// haber dos o más estructuras repetitivas en un algoritmo
fun actividad8(){
    val listas = mutableListOf<Int>(0,0);
    for (i in 0..1){
        println("Introduzca 5 valores para la lista "+i+1);
        for (x in 1..5){
            listas[i] += readLine()!!.toInt();
        }
    }
    when{
        listas[0] > listas[1] -> println("Lista 1 mayor")
        listas[0] < listas[1] -> println("Lista 2 mayor")
        listas[0] == listas[1] -> println("Listas iguales")
    }
}
//Desarrollar un programa que permita cargar n números enteros y luego nos
// informe cuántos valores fueron pares y cuántos impares. Emplear el operador "%" en la condición de la estructura condicional
fun actividad9(){
    println("Introduzca un cuantos numeros quieres calcular");
    val num = readLine()!!.toInt();
    var par: Int = 0;
    var impar: Int = 0;
    println("Introduzca $num numeros");
    for (i in 1..num){
        val n = readLine()!!.toInt();
        when{
            n % 2 == 0 -> par++
            else->{
                impar++
            }
        }
    }
    println("hay $par pares y $impar impares")
}

//Crea una aplicación que nos pida la altura de la silla y nos dibuje por pantalla una silla con *.
// La única restricción que no debe ser menor de 7 ni mayor de 30 y la condición de que el asiento este situado la mitad + 1
fun actividad10(){
    println("Introduzca un la altura de la silla (de 7 a 30");
    val num = readLine()!!.toInt();
    if(num >= 7 && num <=30){
        val mitad = (num/2)+1;
        for (i in 1..num){
            when{
                i < mitad -> println("*");
                i == mitad -> {
                    for(x in 1..mitad){
                        print("*")
                    }
                }
                i > mitad -> {
                    println();
                    print("*")
                    for(z in 1..(mitad)-2){
                        print(" ")
                    }
                    print("*")
                }
            }
        }
    }
}
//Crea una aplicación que nos pida la altura del arbol y nos dibuje por pantalla dicho arbol. Tiene que tener una altura mínima de 5
fun actividad11(){
    println("Introduzca un la altura de la piramide minimo debe ser de 5 alturas");
    val num = readLine()!!.toInt();
    if(num >= 5) {
        for (i in 1..num) {
            //Espacios en blanco
            for (x in 1..(num - i)) {
                print(" ")
            }

            //Asteriscos
            for (z in 1..((i * 2) - 1)) {
                print("*")
            }
            println()
        }
    }
}