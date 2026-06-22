Algoritmo "Combustivel"
// Problema "Combustível" - Estrutura repetitiva Enquanto
Var

   codigo, gasolina, diesel, alcool : inteiro

Inicio

   escreva("Informe um codigo (1, 2, 3) ou 4 para parar: ")
   leia(codigo)

   enquanto codigo <> 4 faca
      escolha codigo
      caso 1
         gasolina <- gasolina + 1
      caso 2
         diesel <- diesel + 1
      caso 3
         alcool <- alcool + 1
      fimescolha

      escreva("Informe um codigo (1, 2, 3) ou 4 para parar: ")
      leia(codigo)
   fimenquanto
   escreval
   escreval("Muito obrigado. Volte sempre!")
   escreval("Gasolina:", gasolina)
   escreval("Diesel:", diesel)
   escreval("Alcool:", alcool)
   
Fimalgoritmo