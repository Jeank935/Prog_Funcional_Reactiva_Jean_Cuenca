def fNombre(n: Int) = (1 to n).product
val respuestadoNombre=fNombre(5)

val fSinNombre= (n: Int) => (1 to n).product
val respuestaSinNombre= fSinNombre(5)

def fSum(n: Int):Int = (1 to n).sum
val fSumSinNombre= (n: Int) => (1 to n).sum

def calcularArea(base: Double, altura: Double): Double = {
  base * altura
}
val calcularAreaSinNombre = (base: Double, altura: Double) => base * altura

val lista = (1 to 10)
lista.filter( (i:Int)=> i%2==0) // especificando el tipo
lista.filter(_%2==0) // Meta Caracter