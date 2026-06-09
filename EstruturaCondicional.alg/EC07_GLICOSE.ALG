Algoritmo "EC07_Glicose"
// Capítulo Estrutura Condicional: Problema "Glicose"
Var

   glicose : real
   classificacao : caractere

Inicio

   escreva("Digite sua medida de glicose: ")
   leia(glicose)
   
   se glicose <= 100 entao
      classificacao <- "Normal"
   senao
      se glicose <= 140 entao
         classificacao <- "Elevado"
      senao
         classificacao <- "Diabetes"
      fimse
   fimse
   
   escreval("Classificação: ", classificacao)

Fimalgoritmo