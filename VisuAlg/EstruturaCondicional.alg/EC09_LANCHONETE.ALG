Algoritmo "EC09_Lanchonete"
// Capítulo Estrutura Condicional: Problema "Lanchonete"
Var
   codigo, quantidade : inteiro
   valorTotal : real

Inicio

   escreval("TABELA DE PRODUTOS")
   escreval("1. Suco")
   escreval("2. Coca-Cola")
   escreval("3. Milk-shake")
   escreval("4. Cheeseburger")
   escreval("5. Porção de Batata")
   escreva("DIGITE O CÓDIGO DO PRODUTO COMPRADO: ")
   leia(codigo)
   escreva("Quantidade: ")
   leia(quantidade)

   escolha codigo
   caso 1
      valorTotal <- 5.00 * quantidade
   caso 2
      valorTotal <- 3.50 * quantidade
   caso 3
      valorTotal <- 4.80 * quantidade
   caso 4
      valorTotal <- 8.90 * quantidade
   caso 5
      valorTotal <- 7.32 * quantidade
   outrocaso
      escreva("Opção inválida")

   fimescolha

   escreval("Valor a pagar: R$", valorTotal:5:2)

Fimalgoritmo