Algoritmo "Quadrantes"
// Problema "Quadrantes" - Estrutura Repetitiva Enquanto
Var

   X, Y : inteiro
   origem : caractere

Inicio

   escreval("Digite os valores das coordenadas X e Y:")
   escreva("X: ")
   leia(X)
   escreva("Y: ")
   leia(Y)
   enquanto (X <> 0) e (Y <> 0) faca
      se (X > 0) e (Y > 0) entao
         origem <- "1° QUADRANTE"
      senao
         se (X < 0) e (Y > 0) entao
            origem <- "2° QUADRANTE"
         senao
            se (X < 0) e (Y < 0) entao
               origem <- "3° QUADRANTE"
            senao
               origem <- "4° QUADRANTE"
            fimse
         fimse
      fimse

      escreval("", origem)
      escreval
      escreva("X: ")
      leia(X)
      escreva("Y: ")
      leia(Y)

   fimenquanto
Fimalgoritmo