Algoritmo "par_ou_impar"
// Problema "Par Ou Ímpar" - Estrutura de Repetição Para

Var

   N, i, X : inteiro

Inicio

   escreva("Quantos números você vai digitar? ")
   leia(N)

   Para i de 1 ate N faca
      escreva("Digite um número: ")
      leia(X)
      se X = 0 entao
         escreval("Valor nulo.")
      senao
         se X % 2 = 0 entao
            se X > 0 entao
               escreval("Par positivo")
            senao
               escreval("Par negativo")
            fimse
         senao
            se X > 0 entao
               escreval("Ímpar positivo")
            senao
               escreval("Ímpar negativo")
            fimse
         fimse
      fimse

   fimPara

Fimalgoritmo