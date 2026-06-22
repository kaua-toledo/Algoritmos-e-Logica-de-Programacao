Algoritmo "experiencias"
// Problema "Experiências" - Estrutura de Repetição Para

Var

   i, N, qtd, ratos, sapos, coelhos, total : inteiro
   porcentoC, porcentoS, porcentoR : real
   cobaia : caractere

Inicio

   escreva("Quantos casos de testes serão digitados? ")
   leia(N)

   Para i de 1 ate N faca
      escreva("Quantidade de cobaias: ")
      leia(qtd)
      escreva("Tipo de Cobaia (R / S / C): ")
      leia(cobaia)

      Escolha cobaia
      caso "R"
         ratos <- qtd + ratos

      caso "S"
         sapos <- qtd + sapos

      caso "C"
         coelhos <- qtd + coelhos
      fimEscolha
   fimPara

   total <- coelhos + ratos + sapos
   porcentoC <- (coelhos / total) * 100
   porcentoS <- (sapos / total) * 100
   porcentoR <- (ratos / total) * 100

   escreval
   escreval("* RELATÓRIO FINAL *")
   escreval("Total de Cobaias: ", total)
   escreval("Total de Coelhos: ", coelhos)
   escreval("Total de Ratos: ", ratos)
   escreval("Total de Sapos: ", sapos)
   escreval("Porcentual de Coelhos: ", porcentoC:4:2)
   escreval("Porcentual de Ratos: ", porcentoR:4:2)
   escreval("Porcentual de Sapos: ", porcentoS:4:2)

Fimalgoritmo