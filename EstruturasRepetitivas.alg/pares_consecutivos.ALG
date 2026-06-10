Algoritmo "pares_consecutivos"
// Problema "Pares Consecutivos" - Estrutura repetitiva Enquanto
Var

   X, soma : inteiro

Inicio

   escreva("Digite um número inteiro: ")
   leia(X)

   enquanto X <> 0 faca
      se X % 2 <> 0 entao
         X <- X + 1
      fimse

      soma <- 5 * X + 20

      escreval("Pares Consecutivos:", X, " +", X+2, " +", X+4, " +", X+6, " +", X+8, " =", soma)
      escreval
      escreva("Digite um número inteiro: ")
      leia(X)
   fimenquanto
Fimalgoritmo