Algoritmo "maior_posicao"
// Problema "Maior posição" - Vetores
Var

   i, N, maiorPos : inteiro
   maior : real
   vet : vetor [0..99] de real

Inicio

   escreva("Quantos números você vai digitar? ")
   leia(N)

   para i de 0 ate N-1 faca
      escreva("Digite um número: ")
      leia(vet[i])
   fimpara

   maior <- vet[0]
   maiorPos <- 0
   para i de 1 ate N-1 faca
      se vet[i] > maior entao
         maior <- vet[i]
         maiorPos <- i
      fimse
   fimpara

   escreval("* Maior Valor: ", maior:4:2)
   escreval("* Posição:", maiorPos)

Fimalgoritmo