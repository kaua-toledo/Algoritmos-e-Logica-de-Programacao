Algoritmo "Notas_EC01"
// Capítulo Estrutura Condicional: Problema "Notas"
Var

   nota1, nota2, notaFinal : real

Inicio

   escreval("Conferir Nota Final:")
   escreval
   escreva("Digite sua nota do Primeiro Semestre: ")
   leia(nota1)
   escreva("Digite sua nota do Segundo Semestre: ")
   leia(nota2)
   escreval

   notaFinal <- nota1 + nota2

   se notaFinal >= 60 entao
      escreval("Sua média final é ", notaFinal:4:1)
      escreval("Parabéns! Você foi aprovado.")
   senao
      escreval("Sua média final é ", notaFinal:4:1)
      escreval("Infelizmente, você foi reprovado.")
   fimse


Fimalgoritmo