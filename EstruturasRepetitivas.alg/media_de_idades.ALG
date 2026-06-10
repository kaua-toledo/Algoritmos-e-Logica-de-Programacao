Algoritmo "media_de_idades"
// Problema "Média de Idades" - Estrutura repetitiva Enquanto
Var

   idade, soma, cont : inteiro
   media : real

Inicio

   escreval("Digite as idades:")
   leia(idade)

   se idade < 0 entao
      escreva("Impossível calcular!")
   fimse

   enquanto idade >= 0 faca

      soma <- soma + idade
      cont <- cont + 1
      media <- soma / cont

      leia(idade)
      
      se idade < 0 entao
         escreval("Média: ", media:5:2)
      fimse
   fimenquanto
   
Fimalgoritmo