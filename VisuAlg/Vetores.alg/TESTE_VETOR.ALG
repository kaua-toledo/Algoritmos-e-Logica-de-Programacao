Algoritmo "teste_vetor"
// Problema "Lista de Números" - Vetores
Var

   i, N : inteiro
   X : real
   vet: vetor [0..9] de real

Inicio

   // Para verificar se o valor de entrada está dentro do limite
   repita
      escreval("Quantos números você vai digitar? (Máx. 10)")
      leia(N)
   ate (N < 10) e (N > 0)

   // Atribui dados aos vetores com os valores de entrada do usuário
   para i de 0 ate N-1 faca
      escreva("Digite um número: ")
      leia(vet[i])
   fimpara

   escreval

   escreval("* Números Digitados *")

   // Loop que mostra os valores armazenados nos vetores
   para i de 0 ate N-1 faca
      escreval(" ", vet[i])
      i <- i + 1
   fimpara

Fimalgoritmo