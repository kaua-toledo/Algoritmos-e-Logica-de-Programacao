Algoritmo "aula22_ex001"
  // Disciplina: [Linguagem e Lógica de Programação]
  // Professor: Nélio Alves
  // Informe o valor de dois produtos, código da compra, e dados pessoais

Var
  // Produtos
  produto1 : caractere
  produto2 : caractere
  preco1 : real
  preco2 : real
  // Dados da pessoa
  codigo : inteiro
  idade : inteiro
  genero : caractere

Inicio

  produto1 <- "MacBook Air M4"
  produto2 <- "iPhone 17 Pro Max"
  preco1 <- 899
  preco2 <- 1199.40
  codigo <- 5679
  idade <- 27
  genero <- "Feminino"
  
  escreval("Produtos:")
  escreval("O ", produto1, " custa $", preco1:2)
  escreval("O ", produto2, " custa $", preco2:2)
  escreval()
  escreval("Dados do comprador:")
  escreval("Gênero: ", genero)
  escreval("Idade: ", idade:2)
  escreval()
  escreval("Código de compra: ", codigo)
  
Fimalgoritmo