Algoritmo "Bhaskara_EC02"
// Capítulo Estrutura Condicional: Problema "Bhaskara"

Var

   a, b ,c, delta, x1, x2 : real

Inicio

   escreval("Informe os valores para o cálculo de Bhaskara")
   escreva("Coeficiente A: ")
   leia(a)
   escreva("Coeficiente B: ")
   leia(b)
   escreva("Coeficiente C: ")
   leia(c)
   escreval
   escreval("Fórmulas:")
   escreval("Delta = b² - 4.a.c")
   escreval("X = -b ± RaizQ(Delta) / 2 * A")
   escreval
   // Cálculo de Delta
   delta <- Exp(b, 2.0) - (4 * a * c)
   // Verificação de raízes reais
   se (delta < 0) ou (a = 0) entao
      escreva("Não existem raízes reais.")
   senao
      x1 <- (-b + RaizQ(delta)) / (2.0 * a)
      x2 <- (-b - RaizQ(delta)) / (2.0 * a)
      escreval("Resultado Final (X1 , X2) = (", x1:4:2, ", ", x2:4:2, ")")
   fimse



Fimalgoritmo