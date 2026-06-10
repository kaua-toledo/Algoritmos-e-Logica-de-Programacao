Algoritmo "dentro_ou_fora"
// Problema "Dentro ou fora do intervalo" - Estrutura de repetição Para
Var

   N, X, i, dentro, fora : inteiro

Inicio

   escreva("Quantos números você vai digitar? ")
   leia(N)

   para i de 1 ate N faca
      escreva("Digite um número: ")
      leia(X)
      se (X >= 10) e (X <= 20) entao
         dentro <- dentro + 1
      senao
         fora <- fora + 1
      fimse
   fimpara

   escreval("INTERVALO [10,20]")
   escreval("Dentro:", dentro)
   escreval("Fora:", fora)

Fimalgoritmo