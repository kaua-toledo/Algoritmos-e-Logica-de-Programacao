Algoritmo "alturas"
// Problema "Dados: Altura média e porcentagem de pessoas menores de 16 anos"
// Vetores
Var

   somaAltura, mediaAltura, mediaMenorDe16 : real
   i, N, cont : inteiro
   nomes : vetor [0..9] de caractere
   idades : vetor [0..9] de inteiro
   alturas : vetor [0..9] de real

Inicio

   escreva("Quantas pessoas serão digitadas? ")
   leia(N)

   para i de 0 ate N-1 faca
      escreval("* Dados da", i+1, "° pessoa")
      escreva("Nome: ")
      leia(nomes[i])
      escreva("Idade: ")
      leia(idades[i])
      escreva("Altura: ")
      leia(alturas[i])
   fimpara

   cont <- 0
   para i de 0 ate N-1 faca
      se idades[i] < 16 entao
         cont <- cont + 1
      fimse
   fimpara

   somaAltura <- 0
   para i de 0 ate N-1 faca
      somaAltura <- somaAltura + alturas[i]
   fimpara

   mediaAltura <- somaAltura / N
   mediaMenorDe16 <- (cont * 100) / N
   
   escreval
   escreval("* Resultados Finais")
   escreval("Altura média: ", mediaAltura:3:2)
   escreval("Pessoas com menos de 16 anos: ", mediaMenorDe16:3:1, "%")

   para i de 0 ate N-1 faca
      se idades[i] < 16 entao
         escreval(nomes[i])
      fimse
   fimpara

Fimalgoritmo