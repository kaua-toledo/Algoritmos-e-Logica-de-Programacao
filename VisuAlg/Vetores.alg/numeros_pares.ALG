Algoritmo "numeros_pares"
// Problema "Números Pares" - Vetores
Var

   i, N, cont : inteiro
   numeros : vetor [0..9] de inteiro

Inicio

   escreva("Quantos numeros voce vai digitar? ")
   leia(N)

   para i de 0 ate N-1 faca
      escreva("Digite um número: ")
      leia(numeros[i])
   fimpara

   cont <- 0

   escreval("* Números Pares")
   para i de 0 ate N-1 faca
      se numeros[i] % 2 = 0 entao
         escreva(" ", numeros[i])
         cont <- cont + 1
      fimse
   fimpara

   escreval
   escreval("* Quantidade de Pares = ", cont)

Fimalgoritmo