Algoritmo "EC08_Dardo"
// Capítulo Estrutura Condicional: Problema "Dardo"
Var

   distancia1, distancia2, distancia3, maiorDistancia : real

Inicio

   escreval("ARREMESSO DE DARDO")
   escreval("Digite as Três Distâncias:")
   leia(distancia1)
   leia(distancia2)
   leia(distancia3)

   se (distancia1 > distancia2) e (distancia1 > distancia3) entao
      maiorDistancia <- distancia1
   senao
      se distancia2 > distancia3 entao
         maiorDistancia <- distancia2
      senao
         maiorDistancia <- distancia3
      fimse
   fimse
   
   escreval("MAIOR DISTÂNCIA: ", maiorDistancia:4:2)

Fimalgoritmo