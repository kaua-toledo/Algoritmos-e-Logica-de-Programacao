Algoritmo "teste_RepitaAte"
// Problema "Conversão de Celsius para Fahrenheit"
// Estrutura de Repetição REPITA ATÉ
Var

   celsius, fahrenheit : real
   S, N, resp : caractere

Inicio

   repita
      escreva("Digite a temperatura em Celsius: ")
      leia(celsius)

      fahrenheit <- ((9 * celsius) / 5) + 32

      escreval("Equivalente em Fahrenheit: ", fahrenheit:3:1)
      escreval("Deseja repetir o programa? (S / N)")
      leia(resp)

   ate resp <> "S"

Fimalgoritmo