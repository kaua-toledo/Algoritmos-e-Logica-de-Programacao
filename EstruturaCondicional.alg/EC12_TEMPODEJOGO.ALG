Algoritmo "EC12_TempoDeJogo"
// Capítulo Estrutura Condicional: Problema "Tempo de Jogo"
Var

   horaInicial, horaFinal, duracao : inteiro

Inicio

   escreva("Hora Inicial: ")
   leia(horaInicial)
   escreva("Hora Final: ")
   leia(horaFinal)
   escreval

   se horaFinal > horaInicial entao
      duracao <- horaFinal - horaInicial
   senao
      duracao <- (24 - horaInicial) + horaFinal
   fimse
   
   escreval("Tempo de Jogo:", duracao, " hora(s)")

Fimalgoritmo