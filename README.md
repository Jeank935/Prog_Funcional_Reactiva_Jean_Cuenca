# Prog_Funcional_Reactiva_Jean_Cuenca
## TAREA DE CONSULTA
FUNCION CON NOMBRE
```scala
def fNombre(n: Int) = (1 to n).product
val respuestadoNombre=fNombre(5)
```
FUNCION CON NOMBRE

```scala
val fSinNombre= (n: Int) => (1 to n).product
val respuestaSinNombre= fSinNombre(5)
```
## Comparacion funciones con nombre a sin nombre
### funcion .sum
```scala
def fSum(n: Int):Int = (1 to n).sum
val fSumSinNombre= (n: Int) => (1 to n).sum
```
### funcion calcular area de una figura
```scala
def calcularArea(base: Double, altura: Double): Double = {
  base * altura
val calcularAreaSinNombre = (base: Double, altura: Double) => base * altura
}```

