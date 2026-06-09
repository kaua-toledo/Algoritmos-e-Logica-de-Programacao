Algoritmo "EC13_Coordenada"
// Capítulo Estrutura Condicional: Problema "Coordenada"
Var

   x, y : real
   origem : caractere

Inicio

   escreva("Valor de X: ")
   leia(x)
   escreva("Valor de Y: ")
   leia(y)

   se (x > 0) e (y > 0) entao
      origem <- "Q1"
   senao
      se (x < 0) e (y > 0) entao
         origem <- "Q2"
      senao
         se (x < 0) e (y < 0) entao
            origem <- "Q3"
         senao
            se (x > 0) e (y < 0) entao
               origem <- "Q4"
            senao
               se (x > 0) e (y = 0) entao
                  origem <- "Eixo X"
               senao
                  se (y > 0) e (x = 0) entao
                     origem <- "Eixo Y"
                  senao
                     origem <- "Origem"
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse


   escreval("POSIÇÃO: ", origem)

Fimalgoritmo