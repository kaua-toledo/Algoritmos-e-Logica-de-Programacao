Algoritmo "dados_pessoas"
// Problema "Dados de pessoas: Altura e Gêneros"
Var

   i, N, contM, contF : inteiro
   alturas : vetor [0..99] de real
   generos : vetor [0..99] de caractere
   menorAltura, maiorAltura, mediaAlturaF, somaAlturaF : real

Inicio

   escreva("Quantas pessoas serao digitadas? ")
   leia(N)

   contF <- 0
   contM <- 0

   para i de 0 ate N-1 faca
      escreva("Altura da ", i+1, "° pessoa: ")
      leia(alturas[i])
      escreva("Genero da ", i+1, "° pessoa: ")
      leia(generos[i])

      se generos[i] = "F" entao
         contF <- contF + 1
      fimse

      se generos[i] = "M" entao
         contM <- contM + 1
      fimse
   fimpara

   menorAltura <- alturas[0]
   maiorAltura <- alturas[0]
   para i de 1 ate N-1 faca
      se menorAltura > alturas[i] entao
         menorAltura <- alturas[i]
      fimse
      se maiorAltura < alturas[i] entao
         maiorAltura <- alturas[i]
      fimse
   fimpara

   escreval("* Menor Altura: ", menorAltura:3:2)
   escreval("* Maior Altura: ", maiorAltura:3:2)

   somaAlturaF <- 0
   para i de 0 ate N-1 faca
      se generos[i] = "F" entao
         somaAlturaF <- somaAlturaF + alturas[i]
      fimse
   fimpara

   mediaAlturaF <- somaAlturaF / contF
   escreval("* Média de Altura das Mulheres: ", mediaAlturaF:3:2)
   escreval("* Número de Homens: ", contM)

Fimalgoritmo