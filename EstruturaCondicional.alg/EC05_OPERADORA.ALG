Algoritmo "EC05_Operadora"
// Capítulo Estrutura Condicional "Operadora"
Var

   valor : real
   minutos : inteiro

Inicio
   escreval("SERVIÇO DE TELEFONE")
   escreva("Digite a quantidade de minutos: ")
   leia(minutos)
   valor <- 50.00

   se minutos > 100 entao
      valor <- (minutos - 100) * 2 + valor
   fimse

   escreval("Valor a ser cobrado: R$", valor:4:2)

Fimalgoritmo