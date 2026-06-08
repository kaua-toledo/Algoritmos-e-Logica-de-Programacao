Algoritmo "aula29_ex002"
  // Capítulo Estruturas Sequenciais "Retângulo"

Var

  base, altura, area, perimetro, diagonal : real

Inicio

  escreva("Base do Retângulo: ")
  leia(base)
  
  escreva("Altura do Retângulo: ")
  leia(altura)

  area <- base * altura
  escreval("ÁREA: ", area:8:4)
  
  perimetro <- 2 * (base + altura)
  escreval("PERÍMETRO: ", perimetro:8:4)
  
  diagonal <- RaizQ(Exp(base, 2.0) + Exp(altura, 2.0))
  escreval("DIAGONAL: ", diagonal:8:4)

  
Fimalgoritmo