Algoritmo "meida_ponderada"
// Problema "Média ponderada" - Estrutura de Repetição Para
Var

   i, n : inteiro
   a, b, c, media, soma : real

Inicio

   escreva("Quantos casos você vai digitar? ")
   leia(n)

   para i de 1 ate n faca
      escreval("Digite três números:")
      leia(a)
      leia(b)
      leia(c)
      soma <- a * 2 + b * 3 + c * 5
      media <- soma / 10
      escreval("MÉDIA PONDERADA: ", media:3:1)
   fimpara

Fimalgoritmo