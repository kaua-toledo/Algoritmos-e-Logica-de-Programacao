Algoritmo "media_de_pares"
// Problema "Média de números pares" - Vetores
Var

   i, N, somaPares, contPares : inteiro
   mediaPares : real
   numeros : vetor [0..99] de inteiro

Inicio

   escreva("Quantos elementos terá o vetor? ")
   leia(N)

   para i de 0 ate N-1 faca
      escreva("Digite um valor: ")
      leia(numeros[i])
   fimpara
   somaPares <- 0
   contPares <- 0
   para i de 0 ate N-1 faca
      se numeros[i] % 2 = 0 entao
         somaPares <- somaPares + numeros[i]
         contPares <- contPares + 1
      fimse
   fimpara

   se contPares = 0 entao
      escreval("* Nenhum número par foi encontrado.")
   senao
      mediaPares <- somaPares / contPares
      escreval("* Média dos Pares = ", mediaPares:3:1)
   fimse

Fimalgoritmo