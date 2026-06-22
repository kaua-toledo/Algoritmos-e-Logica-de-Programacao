Algoritmo "divisao"
// Problema "Divisão" - Estrutura de Repetição Para
Var

   i, N : inteiro
   x, y, divisao : real

Inicio

   escreva("Quantos casos você vai digitar? ")
   leia(N)

   para i de 1 ate N faca
      escreva("Digite o numerador: ")
      leia(x)
      escreva("Digite o denominador: ")
      leia(y)
      se y = 0 entao
         escreval("Divisão Impossível!")
      senao
         divisao <- x / y
         escreval("DIVISÃO: ", divisao:4:2)
      fimse
   fimpara

Fimalgoritmo