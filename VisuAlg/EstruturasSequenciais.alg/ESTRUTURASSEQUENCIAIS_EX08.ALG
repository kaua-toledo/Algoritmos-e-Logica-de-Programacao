Algoritmo "EstruturasSequenciais_ex08"
// Capítulo Estruturas Sequenciais "Medidas"
Var

   a, b, c, areaQuadrado, areaTriangulo, areaTrapezio : real

Inicio

   escreval("Informe o Valor das Medidas")
   escreval()
   escreva("Medida A: ")
   leia(a)
   escreva("Medida B: ")
   leia(b)
   escreva("Medida C: ")
   leia(c)
   escreval()

   // Área do Quadrado tem lado A
   areaQuadrado <- Exp(a, 2.0)
   escreval("Área do Quadrado: ", areaQuadrado:8:4)

   // Área do Triângulo tem base A e altura B
   areaTriangulo <- (a * b) / 2.0
   escreval("Área do Triângulo: ", areaTriangulo:8:4)

   // Área do Trapézio tem bases A e B, e altura C
   areaTrapezio <- ((a + b) * c) / 2.0
   escreval("Área do Trapézio: ", areaTrapezio:8:4)

Fimalgoritmo