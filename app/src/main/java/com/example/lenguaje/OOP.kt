package com.example.lenguaje

   fun main(){
        println("Hola devs")
       //When expression
       /*
       val dia = 4
       val diaStr:String = when(dia){
           1 -> "Lunes"
           2 -> "Martes"
           3 -> "Miércoles"
           4 -> "Jueves"
           5 -> "Viernes"
           6 -> "Sabado"
           7 -> "Domingo"
           else -> {"Día no válido"}
       }
      print(diaStr) */
       /* Break & Continue */
       /* val arraySample:Array<String> = arrayOf("Uno", "Dos", "Tres")
       for (a in arraySample){
           a
       }

       val arraySinTipo = arrayOf(1,3,4F)
       for e in arraySinTipo{
           a
       }*/
       /* Rangos 'a'..'z' */
       /*Array in (operador in) */
       /* Break Continue */

    }
/*
fun suma(a:Int, b:Int):Int{
    return (a + b)
}

fun sumaCorta(a:Int, b:Int):Int = (a+b)

//Singleton
// Accediendo a las propiedades del singleton
val currentUrl = ConfigManager.url
val currentTimeout = ConfigManager.timeout

// Imprimiendo las propiedades
println("URL actual: $currentUrl")
println("Timeout actual: $currentTimeout")

// Utilizando el método para actualizar la configuración
ConfigManager.updateConfiguration("https://api.nuevositio.com", 10000)

// Verificando que los cambios se hayan aplicado
println("Nueva URL: ${ConfigManager.url}")
println("Nuevo timeout: ${ConfigManager.timeout}")

val immutableList = listOf("Apple", "Banana", "Cherry")
println("Elementos de la lista inmutable: $immutableList")

// Accediendo a elementos
val firstItem = immutableList[0]
println("Primer elemento: $firstItem")

// Intentar modificar la lista inmutable generará un error de compilación:
// immutableList.add("Orange") // Error: Unresolved reference: add


val mutableList = mutableListOf("Apple", "Banana", "Cherry")
println("Elementos de la lista mutable inicial: $mutableList")

// Añadiendo elementos
mutableList.add("Orange")
println("Después de añadir 'Orange': $mutableList")

// Eliminando elementos
mutableList.remove("Banana")
println("Después de eliminar 'Banana': $mutableList")

// Modificando un elemento por índice
mutableList[1] = "Kiwi"
println("Después de cambiar 'Cherry' por 'Kiwi': $mutableList")

val numbers = listOf(1, 2, 3, 4, 5)

// Filtrar elementos
val filteredNumbers = numbers.filter { it % 2 == 0 }
println("Números pares: $filteredNumbers")

// Mapear elementos
val squaredNumbers = numbers.map { it * it }
println("Cuadrados de los números: $squaredNumbers")

// Reducción de elementos (sumar todos los elementos)
val sum = numbers.reduce { acc, i -> acc + i }
println("Suma de los elementos: $sum")

// Mutable list sorting
val mutableNumbers = mutableListOf(5, 3, 1, 4, 2)
mutableNumbers.sort()
println("Números ordenados: $mutableNumbers")


val numbers = listOf(1, 2, 3, 4, 5)

// Filtrar elementos
val filteredNumbers = numbers.filter { it % 2 == 0 }
println("Números pares: $filteredNumbers")

// Mapear elementos
val squaredNumbers = numbers.map { it * it }
println("Cuadrados de los números: $squaredNumbers")

// Reducción de elementos (sumar todos los elementos)
val sum = numbers.reduce { acc, i -> acc + i }
println("Suma de los elementos: $sum")

// Mutable list sorting
val mutableNumbers = mutableListOf(5, 3, 1, 4, 2)
mutableNumbers.sort()
println("Números ordenados: $mutableNumbers")


val immutableSet = setOf("apple", "banana", "cherry")
println("Conjunto inmutable: $immutableSet")

// Intentar añadir o eliminar elementos resultará en un error de compilación
// immutableSet.add("orange") // Error


val mutableSet = mutableSetOf("apple", "banana", "cherry")
println("Conjunto mutable inicial: $mutableSet")

// Añadiendo un elemento
mutableSet.add("orange")
println("Después de añadir 'orange': $mutableSet")

// Eliminando un elemento
mutableSet.remove("banana")
println("Después de eliminar 'banana': $mutableSet")

// Añadiendo un elemento duplicado (no tendrá efecto porque los sets no permiten duplicados)
mutableSet.add("apple")
println("Intentando añadir duplicado 'apple': $mutableSet")

val setA = setOf(1, 2, 3, 4)
val setB = setOf(3, 4, 5, 6)

// Unión
val union = setA.union(setB)
println("Unión de setA y setB: $union")

// Intersección
val intersection = setA.intersect(setB)
println("Intersección de setA y setB: $intersection")

// Diferencia
val difference = setA.subtract(setB)
println("Diferencia de setA y setB: $difference")

val immutableMap = mapOf("a" to 1, "b" to 2, "c" to 3)
println("Mapa inmutable: $immutableMap")

// Acceder a valores por clave
val valueB = immutableMap["b"]
println("Valor asociado a la clave 'b': $valueB")

// Intentar añadir o modificar elementos resultará en un error de compilación
// immutableMap["d"] = 4 // Error

val mutableMap = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
println("Mapa mutable inicial: $mutableMap")

// Añadiendo un nuevo par clave-valor
mutableMap["d"] = 4
println("Después de añadir el par 'd' a 4: $mutableMap")

// Modificando un valor existente
mutableMap["a"] = 10
println("Después de modificar el valor de 'a' a 10: $mutableMap")

// Eliminando un par clave-valor
mutableMap.remove("b")
println("Después de eliminar la clave 'b': $mutableMap")

val map = mapOf("a" to 1, "b" to 2, "c" to 3)

// Accediendo a las claves
println("Claves del mapa: ${map.keys}")

// Accediendo a los valores
println("Valores del mapa: ${map.values}")

// Accediendo a las entradas
for (entry in map.entries) {
    println("Clave: ${entry.key}, Valor: ${entry.value}")
}

//SOLID
//SRP
class EmailService {
    fun sendEmail(emailContent: String, recipient: String) {
        // Lógica para enviar un correo electrónico
        println("Email enviado a $recipient con contenido: $emailContent")
    }
}

class User {
    var email: String = ""
    var username: String = ""

    fun updateEmail(newEmail: String) {
        email = newEmail
        EmailService().sendEmail("Tu correo ha sido actualizado a $newEmail", email)
    }
}

//OCP
abstract class Shape {
    abstract fun calculateArea(): Double
}

class Circle(private val radius: Double) : Shape() {
    override fun calculateArea() = Math.PI * radius * radius
}

class Square(private val side: Double) : Shape() {
    override fun calculateArea() = side * side
}

fun printArea(shape: Shape) {
    println("El área es: ${shape.calculateArea()}")
}
//LSP (liskov)
open class Bird {
    open fun fly() {
        println("El pájaro vuela")
    }
}

//ISP Iterface Segration
interface Printer {
    fun printDocument()
}

interface Scanner {
    fun scanDocument()
}

class SimplePrinter : Printer {
    override fun printDocument() {
        println("Documento impreso")
    }
}

class MultiFunctionMachine : Printer, Scanner {
    override fun printDocument() {
        println("Documento impreso")
    }

    override fun scanDocument() {
        println("Documento escaneado")
    }
}

//DIP DEpendency Inversion
interface UserRepository {
    fun getUser(id: Int): User
}

class UserDataAccess : UserRepository {
    override fun getUser(id: Int) = User() // Simulando obtener un usuario
}

class UserManager(private val userRepository: UserRepository) {
    fun getUserDetails(id: Int) {
        val user = userRepository.getUser(id)
        println("Detalles del usuario: ${user.username}")
    }
}



class Duck : Bird() {
    override fun fly() {
        super.fly()
    }
}

class Ostrich : Bird() {
    override fun fly() {
        throw Exception("El avestruz no puede volar")
    }
}



//Factory method
interface Factory<T> {
    fun create(): T
}

class MyClass {
    private var id: Int = 0

    companion object : Factory<MyClass> {
        override fun create(): MyClass {
            val instance = MyClass()
            // Inicializar con datos específicos o realizar operaciones
            instance.id = (Math.random() * 1000).toInt()
            return instance
        }
    }
}

// Crear una instancia usando el factory method del companion object
val newInstance = MyClass.create()
println("Nueva instancia con ID: ${newInstance.id}")

//Strategy
interface RouteStrategy {
    fun calculateRoute(origin: String, destination: String): String
}

class FastestRouteStrategy : RouteStrategy {
    override fun calculateRoute(origin: String, destination: String): String {
        return "Ruta más rápida de $origin a $destination"
    }
}

class ShortestRouteStrategy : RouteStrategy {
    override fun calculateRoute(origin: String, destination: String): String {
        return "Ruta más corta de $origin a $destination"
    }
}

class EconomicRouteStrategy : RouteStrategy {
    override fun calculateRoute(origin: String, destination: String): String {
        return "Ruta más económica de $origin a $destination"
    }
}

class NavigationSystem(var strategy: RouteStrategy) {
    fun navigate(origin: String, destination: String): String {
        return strategy.calculateRoute(origin, destination)
    }

    fun setStrategy(newStrategy: RouteStrategy) {
        strategy = newStrategy
    }
}


fun main() {
    val navigation = NavigationSystem(FastestRouteStrategy())
    println(navigation.navigate("Casa", "Trabajo"))

    // Cambiando la estrategia en tiempo de ejecución
    navigation.setStrategy(ShortestRouteStrategy())
    println(navigation.navigate("Casa", "Trabajo"))

    // Cambiando a otra estrategia
    navigation.setStrategy(EconomicRouteStrategy())
    println(navigation.navigate("Casa", "Trabajo"))
}


//Composite
interface FileSystemComponent {
    fun showDetails(indent: String = "")
}

class File(private val name: String) : FileSystemComponent {
    override fun showDetails(indent: String) {
        println("${indent}File: $name")
    }
}

class Directory(private val name: String) : FileSystemComponent {
    private val children = mutableListOf<FileSystemComponent>()

    fun add(component: FileSystemComponent) {
        children.add(component)
    }

    override fun showDetails(indent: String) {
        println("${indent}Directory: $name")
        val newIndent = indent + "\t"
        children.forEach { it.showDetails(newIndent) }
    }
}

fun main() {
    // Crear componentes de archivos
    val file1 = File("File1.txt")
    val file2 = File("File2.txt")
    val file3 = File("File3.txt")

    // Crear directorios y añadir archivos y otros directorios
    val subdirectory1 = Directory("Subdirectory1")
    subdirectory1.add(file1)

    val subdirectory2 = Directory("Subdirectory2")
    subdirectory2.add(file2)
    subdirectory2.add(file3)

    val rootDirectory = Directory("RootDirectory")
    rootDirectory.add(subdirectory1)
    rootDirectory.add(subdirectory2)

    // Mostrar la estructura
    rootDirectory.showDetails()
}

//Memento
// Memento almacena el estado del Originator.
data class Memento(val state: String)


class Originator(var state: String) {
    // Crea un memento que contiene una copia del estado actual.
    fun saveStateToMemento(): Memento = Memento(state)

    // Restaura el estado del memento.
    fun getStateFromMemento(memento: Memento) {
        state = memento.state
    }
}

class Caretaker {
    private val mementoList = mutableListOf<Memento>()

    // Guarda el estado.
    fun add(state: Memento) {
        mementoList.add(state)
    }

    // Obtiene el memento basado en el índice, para restaurar un estado particular.
    fun get(index: Int): Memento = mementoList[index]
}


fun main() {
    val originator = Originator("Estado Inicial")
    val caretaker = Caretaker()

    // El originator cambia de estado y el caretaker guarda los estados.
    originator.state = "Estado #1"
    caretaker.add(originator.saveStateToMemento())

    originator.state = "Estado #2"
    caretaker.add(originator.saveStateToMemento())

    originator.state = "Estado #3"

    // Restaurando el primer estado guardado
    originator.getStateFromMemento(caretaker.get(0))
    println("Estado actual del originator: ${originator.state}")  // Estado #1

    // Restaurando el segundo estado guardado
    originator.getStateFromMemento(caretaker.get(1))
    println("Estado actual del originator: ${originator.state}")  // Estado #2
}



@Composable
fun BoxExample() {
    // Box permite apilar elementos, en este caso, Text componibles
    Box(
        contentAlignment = Alignment.Center  // Centra los elementos en la caja
    ) {
        Text(
            text = "Hola",
            color = Color.Gray,
            modifier = Modifier.align(Alignment.Center) // Alinea este texto al centro
        )
        Text(
            text = "Mundo",
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.BottomEnd) // Alinea este texto en la esquina inferior derecha
                .padding(16.dp)  // Agrega un poco de padding
        )
    }
}

suspend fun fetchData(): String = withContext(Dispatchers.IO) {
    // Simula la obtención de datos desde una operación bloqueante
    Thread.sleep(1000) // No usar en producción; solo para efectos demostrativos
    return@withContext "Datos cargados"
}

@Composable
fun ShowData() {
    val data = produceState(initialValue = "Cargando...") {
        value = fetchData()
    }

    Text(text = data.value) // Muestra los datos cargados o un mensaje de carga
}

*/