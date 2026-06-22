Algoritmo "matriz_geral"
// Problema "Matriz geral" - Matrizes
Var

   N, Coluna, Linha, i, j : inteiro
   mat : vetor [0..9, 0..9] de real
   soma : real

Inicio

   escreva("Qual a ordem da Matriz? ")
   leia(N)

   para i de 0 ate N-1 faca
      para j de 0 ate N-1 faca
         escreva("Elemento [", i, ",", j, "]: ")
         leia(mat[i, j])
      fimpara
   fimpara

   soma <- 0
   para i de 0 ate N-1 faca
      para j de 0 ate N-1 faca
         se mat[i, j] > 0 entao
            soma <- soma + mat[i, j]
         fimse
      fimpara
   fimpara

   escreval
   escreval("SOMA DOS POSITIVOS: ", soma)
   escreval

   escreva("Escolha uma linha: ")
   leia(Linha)
   escreva("Linha Escolhida: ")

   para j de 0 ate N-1 faca
      escreva(mat[Linha, j]:3:1, " ")
   fimpara
   escreval

   escreva("Escolha uma coluna:")
   leia(Coluna)
   escreva("Coluna Escolhida: ")

   para i de 0 ate N-1 faca
      escreva(mat[i, Coluna]:3:1, " ")
   fimpara

   escreval
   escreva("Diagonal Principal: ")
   para i de 0 ate N-1 faca
      escreva(mat[i, i]:3:1, " ")
   fimpara
   escreval
   
   escreval("Matriz Alterada:")
   para i de 0 ate N-1 faca
      para j de 0 ate N-1 faca
         se mat[i, j] < 0 entao
            mat[i, j] <- mat[i, j] ^ 2
            escreva(mat[i, j]:3:1)
         senao
            escreva(mat[i, j]:3:1)
         fimse
      fimpara
      escreval
   fimpara

Fimalgoritmo