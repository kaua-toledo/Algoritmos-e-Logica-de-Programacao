Algoritmo "MenorDeTres_EC03"
// Capítulo Estrutura Condicional: Problema "Menor de Três"
Var

   n1, n2, n3, menor : inteiro

Inicio

   escreva("Primeiro Número: ")
   leia(n1)
   escreva("Segundo Número: ")
   leia(n2)
   escreva("Terceiro Número: ")
   leia(n3)

   se (n1 < n2) e (n1 < n3) entao
      menor <- n1
   senao
      se n2 < n3 entao
         menor <- n2
      senao
         menor <- n3
      fimse
   fimse
   
   escreval("O menor número é", menor)

Fimalgoritmo