Algoritmo "aprovados"
// Problema "Aprovados" - Vetores
Var

   i, N : inteiro
   PrimeiroSemestre : vetor [0..10] de real
   SegundoSemestre : vetor [0..10] de real
   Alunos : vetor [0..10] de caractere
   mediaFinal : real

Inicio

   escreva("Quantos alunos serão digitados? ")
   leia(N)
   para i de 0 ate N-1 faca
      escreval("Digite o nome, primeira e segunda notas do ", i+1, "° aluno")
      leia(Alunos[i])
      leia(PrimeiroSemestre[i])
      leia(SegundoSemestre[i])
   fimpara

   mediaFinal <- 0

   escreval("* Alunos Aprovados:")
   para i de 0 ate N-1 faca
      mediaFinal <- (PrimeiroSemestre[i] + SegundoSemestre[i]) / 2
      se mediaFinal >= 6.0 entao
         escreval(Alunos[i])
      fimse
   fimpara

Fimalgoritmo