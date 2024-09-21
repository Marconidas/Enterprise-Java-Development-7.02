//Ejercicio 1
INICIO
Leer numero
Para i <- 0 hasta (i > numero) i++
    fact <- fact * i
FinPara
Escribir "El factor de " numero "es "fact
FIN

//Ejercicio 2
INICIO
Leer numero
Si ((numero/numero === 0) && (numero%1 === 0))
    Escribir "El " numero " es primo"
SiNo Escribir "El " numero " no es primo"
FIN

//Ejercicio 3
INICIO
Leer array
arrayOrdenada <-[]
num3 <-
Para i <- 0 hasta (i >= array.length) i++
    num1 <- array[i]
    Para c <- 0 hasta (c > array.length) c++
        check <- false
        num2 <- array[c] //Falta solucionar
        Si (num1 < num2)
            num3 <- num2
            arrayOrdenada[i] <- array[c]
            check <- true
        FinSi
        Si ((c === array.length) && ( check === false))
            arrayOrdenada[i] <- array[c]
        FinSi
    FinPara
FinPara
Escribir "La Lista ordenada es " arrayOrdenada
FIN

//Ejercicio 4
INICIO
array <- [1,2,3,4,5,6,7,8,9,10]
Escribir array
FIN

//Ejercicio 5
INICIO
objectArray <- {
    marca: Ferrari,
    modelo: Testarrosa,
    año: 2020
}
objectArray.año <- 2022
FIN


//Ejercicio 6
INICIO
Leer num1
Leer num2
Leer num3
Si ((num1 > num2) && (num1 > num3))
    mayor <- num1
FinSi
Si ((num2 > num1) && (num2 > num3))
    mayor <- num2
FinSi
Si ((num3 > num1) && (num3 > num2))
    mayor <- num3
FinSi
FIN

//Ejercicio 7
INICIO
Leer arrayPromedio
Para i <- 0 (i>arrayPromedio.length) i++
    suma <- suma + arrayPromedio[i]
FinPara
mediaTotal <- suma / arrayPromedio.length
FIN

//Ejercicio 8
INICIO
Leer n //Repeticiones
arrayFibo <- []
Para i <- 0 (i > n) i++
    Si (i === 0)
        arrayFibo[i] <- i
    Sino
        arrayFibo[i] <- (i-1) + i
    FinSi
FinPara
FIN

//Ejercicio 9
INICIO
Leer cadena
Para i <- cadena.length (i <= 0) i--
    cadenaInvers <- cadenaInvers + cadena[i-1]
FinPara
FIN

//Ejercicio 10
INICIO
Leer num
Escribir num.length
FIN

//Ejercicio 11
INICIO
Leer cadena
Para i <- (cadena.length - 1) (i < 0) i--
    cadenaInvers <- cadenaInvers + cadena [i]
FinPara
Si (cadena === cadenaInvers)
    Escribir "La cadena string " cadena " es palindromo (capicua)"
    Sino Escribir "La cadena string " cadena " no es palindromo (capicua)"
FinSi
FIN

//Ejercicio 12
INICIO
