Algoritmo "tabuada"
// Problema "Tabuada" - Estrutura de repetitição aninhada (Enquanto(Para))
Var

   i : inteiro
   X, multiplicacao : real

Inicio

   escreva("Para qual número deseja a tabuada? ")
   leia(X)

   enquanto X <> 0 faca
      para i de 1 ate 10 faca
         multiplicacao <- i * X
         escreval(X, " x", i, " =", multiplicacao)
      fimpara
      escreval
      escreva("Para qual número deseja a tabuada? (0 P/ SAIR): ")
      leia(X)
   fimenquanto

Fimalgoritmo