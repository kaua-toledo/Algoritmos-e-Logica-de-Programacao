Algoritmo "fatorial"
// Problema "Fatorial" - Estrutura de Repetição Para
Var

   i, N, fatorial : inteiro

Inicio

   escreva("Digite o valor de N: ")
   leia(N)

   se (N > 15) ou (N < 0) entao
      escreval("Valor inválido! Digite um número entre 0 e 15")
   senao

      fatorial <- 1

      para i de 1 ate N faca
         fatorial <- fatorial * i
      fimpara

      escreval("Fatorial: ", fatorial)
   fimse

Fimalgoritmo