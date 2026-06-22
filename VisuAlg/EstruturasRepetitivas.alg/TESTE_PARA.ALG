Algoritmo "Teste_Para"
// Testando a estrutura repetitiva Para
Var

   num, n, i, soma : inteiro

Inicio

   escreva("Quantos números serão digitados? ")
   leia(n)

   soma <- 0

   para i de 1 ate n faca
      escreva("Digite um número: ")
      leia(num)
      soma <- soma + num
   fimpara
   
   escreval("A soma dos valores é igual a", soma)

Fimalgoritmo