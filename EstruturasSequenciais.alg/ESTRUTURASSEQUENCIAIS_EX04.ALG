Algoritmo "EstruturasSequenciais_ex04"
// Capítulo Estruturas Sequenciais "Troco"

Var
  quantidade: inteiro
  preco, pagamento, troco, valorFinal : real

Inicio

  escreva("Preço unitário do produto: ")
  leia(preco)
  
  escreva("Quantidade comprada: ")
  leia(quantidade)
  
  escreva("Dinheiro recebido: ")
  leia(pagamento)
  
  valorFinal <- preco * quantidade
  troco <-  pagamento - valorFinal
  
  escreva("TROCO:", troco:8:2)
  
  

Fimalgoritmo