Algoritmo "mais_velho"
// Problema "Mais Velho" - Vetores
Var
   i, N, maisVelho, maiorPosicao : inteiro
   idades : vetor [0..99] de inteiro
   nomes : vetor [0..99] de caractere

Inicio

   escreva("Quantas pessoas vão integrar a lista? ")
   leia(N)

   para i de 0 ate N-1 faca
      escreval("Dados da ", i+1, "° pessoa")
      escreva("Nome: ")
      leia(nomes[i])
      escreva("Idade: ")
      leia(idades[i])
   fimpara

   maisVelho <- idades[0]
   maiorPosicao <- 0
   para i de 1 ate N-1 faca
      se idades[i] > maisVelho entao
         maisVelho <- idades[i]
         maiorPosicao <- i
      fimse
   fimpara

   escreval
   escreval("* ", nomes[maiorPosicao], " é a pessoa mais velha da lista.")

Fimalgoritmo