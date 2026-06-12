Algoritmo "diagonal_negativos"
// Problema "Matriz Diagonal e Negativos" - Matrizes
Var

   i, j, N, negativos : inteiro
   mat : vetor [0..10, 0..10] de inteiro

Inicio

   escreva("Qual a ordem da matriz? ")
   leia(N)
   para i de 0 ate N-1 faca
      para j de 0 ate N-1 faca
         escreva("Elemento [", i, ",", j, "]: ")
         leia(mat[i, j])
      fimpara
   fimpara

   escreval("* Diagonal Principal")
   para i de 0 ate N-1 faca
      escreva(mat[i, i], " ")
   fimpara
   escreval

   para i de 0 ate N-1 faca
      para j de 0 ate N-1 faca
         se mat[i, j] < 0 entao
            negativos <- negativos + 1
         fimse
      fimpara
   fimpara

   escreval("* Quantidade de Negativos")
   escreva(negativos)

Fimalgoritmo