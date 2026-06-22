Algoritmo "soma_impares"
// Problema "Soma dos ímpares" - Estrutura de Repetição Para
Var

   X, Y, troca, i, soma : inteiro

Inicio

   escreval("Digite dois números:")
   leia(X)
   leia(Y)

   se X > Y entao
      troca <- X
      X <- Y
      Y <- troca
   fimse

   soma <- 0
   para i de X+1 ate Y-1 faca
        se i % 2 <> 0 entao
        soma <- soma + i
        fimse
   fimpara
   
   escreval("SOMA DOS NÚMEROS ÍMPARES: ", soma)
   
Fimalgoritmo