Algoritmo "abaixo_da_media"
// Problema "Abaixo da média" - Vetores
Var

   i, N : inteiro
   numeros : vetor [0..10] de real
   soma, media : real

Inicio

   escreva("Quantos elementos terá o vetor? ")
   leia(N)
   
   para i de 0 ate N-1 faca
      escreva("Digite um número: ")
      leia(numeros[i])
      soma <- soma + numeros[i]
   fimpara

   media <- soma / N
   escreval("* MÉDIA DO VETOR: ", media:4:3)
   escreval("* ELEMENTOS ABAIXO DA MÉDIA")
   para i de 0 ate N-1 faca
      se numeros[i] < media entao
         escreval(numeros[i]:3:1)
      fimse
   fimpara

Fimalgoritmo