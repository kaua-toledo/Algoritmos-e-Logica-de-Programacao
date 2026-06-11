Algoritmo "soma_vetor"
// Problema "Soma vetor" - Vetores
Var

   vet : vetor [0..9] de real
   x, soma, media : real
   i, N : inteiro

Inicio

   escreva("Quantos números você vai digitar? ")
   leia(N)

   para i de 0 ate N-1 faca
      escreva("Digite um número: ")
      leia(x)
      vet[i] <- x
      soma <- soma + x
   fimpara

   media <- soma / N

   escreva("Valores: ")

   para i de 0 ate N-1 faca
      escreva(vet[i], " ")
   fimpara

   escreval

   escreval("Soma: ", soma:4:2)
   escreval("Média: ", media:4:2)

Fimalgoritmo