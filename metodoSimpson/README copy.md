# Prog_Funcional_Reactiva_Jean_Cuenca
## TAREA DE CONSULTA
METODO SIMPSON
Funcion Integracion
```scala
def integracion(f: Double => Double, a: Double, b: Double): Double = {
  val x2 = (a + b) / 2
  (b-a) * (f(a) + 4*f(x2) + f(b))/ 6
}
```
Funciones a resolver
```scala
val f1:Double => Double = (x:Double)=> -math.pow(x,2) +8 * x -12
integracion(f1,3,5)
val f2:Double =>Double = (x:Double)=> 3*math.pow(x,2)
integracion(f2,0,2)
val f3:Double =>Double = (x:Double)=> x + 2*math.pow(x,2) - math.pow(x,3) + 5*math.pow(x,4)
integracion(f3,-1,1)
val f4:Double =>Double = (x:Double)=> ((2*x)+1)/(math.pow(x,2))+x
integracion(f4,1,2)
val f5:Double =>Double = (x:Double)=> math.exp(x)
integracion(f5,0,1)
val f6:Double =>Double = (x:Double)=> 1/(math.sqrt(x-1))
integracion(f6,2,3)
val f7:Double =>Double = (x:Double)=> 1/(1+ math.pow(x,2))
integracion(f7,0,1)
```
Calcular error
```scala
def calcularError(valorEsperado: Double, valorObtenido: Double): Double = {
  math.abs(valorEsperado - valorObtenido)
}
calcularError(7.33,7.333333333333333)
calcularError(8.0,8.0)
calcularError(3.333,4.66)
calcularError(1.09861,3.3935185185185186)
calcularError(1.71829,1.7188611518765928)
calcularError(0.828427,0.8288488508162422)
calcularError(0.785398,0.7833333333333333)

```


