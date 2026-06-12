Algoritmo "acima_diagonal"
// Problema "Acima diagonal" - Matrizes
Var

   N, i, j : inteiro
   mat : vetor[0..9, 0..9] de inteiro
   soma : inteiro

Inicio

   escreva("Qual a ordem da matriz? ")
   leia(N)

   para i de 0 ate N-1 faca
      para j de 0 ate N-1 faca
         escreva("Elemento [", i, ",", j, "]: ")
         leia(mat[i, j])
      fimpara
   fimpara

   para i de 0 ate N-1 faca
      para j de i+1 ate N-1 faca
         soma <- soma + mat[i, j]
      fimpara
   fimpara

   escreval("Soma dos Elementos Acima da Diagonal Principal: ", soma)

Fimalgoritmo