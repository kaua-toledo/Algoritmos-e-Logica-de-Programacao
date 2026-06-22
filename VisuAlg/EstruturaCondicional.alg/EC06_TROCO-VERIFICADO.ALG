Algoritmo "EC06_Troco-Verificado"
// Capítulo Estrutura Condicional: Problema "Troco Verificado"
Var

   precoUnitario, valorTotal, pagamento, troco, resto : real
   quantidade : inteiro

Inicio
   escreval("Informe os valores")
   escreva("Preço unitário do produto: ")
   leia(precoUnitario)
   escreva("Quantidade: ")
   leia(quantidade)
   escreva("Dinheiro recebido: ")
   leia(pagamento)

   valorTotal <- precoUnitario * quantidade

   se pagamento >= valorTotal entao
      troco <- pagamento - valorProduto
      escreval("TROCO: R$", troco:4:2)
   senao
      resto <- valorTotal - pagamento
      escreval("DINHEIRO INSUFICIENTE. Faltam R$", resto:4:2)
   fimse

Fimalgoritmo