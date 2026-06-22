Algoritmo "soma_linhas"
// Problema "Soma linhas" - Matrizes
Var

   M, N, i, j : inteiro
   mat : vetor [0..10, 0..10] de real
   soma : real

Inicio

   escreva("Qual a quantidade de linhas da matriz? ")
   leia(M)
   escreva("Qual a quantidade de colunas da matriz? ")
   leia(N)
   
   para i de 0 ate M-1 faca
      escreval("Digite os elementos da", i+1, "a linha: ")
      para j de 0 ate N-1 faca
         leia(mat[i, j])
      fimpara
   fimpara

   escreval("* VETOR GERADO")
   soma <- 0
   para i de 0 ate M-1 faca
      para j de 0 ate N-1 faca
         soma <- soma + mat[i, j]
      fimpara
      escreval(soma:3:1)
      soma <- 0
   fimpara

Fimalgoritmo