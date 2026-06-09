Algoritmo "EC04_Temperatura"
// Capítulo Estrutura Condicional: Problema "Temperatura"

Var

   temperaturaC, temperaturaF : real
   medida : caractere

Inicio

   escreva("Escolha a escala de temperatura (C/F): ")
   leia(medida)

   // Fahrenheit
   se (medida = "F") ou (medida = "f") entao
      escreva("Digite a temperatura em Fahrenheit: ")
      leia(temperaturaF)
      // Cálculo de conversão de F para C
      temperaturaC <- (5 / 9) * (temperaturaF - 32)

      escreval("Temperatura equivalente em Celsius: ", temperaturaC:5:2)

   senao
      // Celsius
      se (medida = "C") ou (medida = "c") entao
         escreva("Digite a temperatura em Celsius: ")
         leia(temperaturaC)
         // Cálculo de conversão de C para F
         temperaturaF <- temperaturaC * 9 / 5 + 32

         escreval("Temperatura equivalente em Fahrenheit: ", temperaturaF:5:2)
      fimse
   fimse

Fimalgoritmo