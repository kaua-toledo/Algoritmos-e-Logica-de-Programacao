Algoritmo "negativos"
// Problema "Negativos" - Vetores
Var

   i, N : inteiro
   X : real
   vet: vetor [0..9] de real

Inicio

   repita
      escreval("Quantos números você vai digitar? (0-10)")
      leia(N)
   ate (N <= 10) e (N > 0)

   para i de 0 ate N-1 faca
      escreva("Digite um número: ")
      leia(X)
      vet[i] <- X
   fimpara

   escreval
   escreval("* Números Negativos *")

   para i de 0 ate N-1 faca
      se vet[i] < 0 entao
         escreval(vet[i])
      fimse
   fimpara

Fimalgoritmo