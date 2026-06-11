Algoritmo "soma_vetores"
// Problema "Soma vetores" - Vetores
Var

   i, N : inteiro
   A, B, C : vetor [0..9] de inteiro

Inicio

   escreva("Quantos valores terá cada vetor? ")
   leia(N)

   escreval("Digite os valores do primeiro vetor:")

   para i de 0 ate N-1 faca
      leia(A[i])
   fimpara

   escreval("Digite os valores do segundo vetor:")

   para i de 0 ate N-1 faca
      leia(B[i])
   fimpara

   para i de 0 ate N-1 faca
      C[i] <- A[i] + B[i]
   fimpara

   escreval("Vetor Resultante *")

   para i de 0 ate N-1 faca
      escreval(C[i])
   fimpara

Fimalgoritmo