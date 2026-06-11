Algoritmo "Comerciante"
// Problema "Comerciante" - Vetores
Var

   i, N, abaixo, entre, acima : inteiro
   percentual, lucro, totalLucro, totalCompra, totalVenda : real
   produtos : vetor [0..10] de caractere
   precoCompra : vetor [0..10] de real
   precoVenda : vetor [0..10] de real

Inicio

   escreva("Quantos produtos serão digitados? ")
   leia(N)

   para i de 0 ate N-1 faca
      escreval("Produto", i+1)
      escreva("Nome: ")
      leia(produtos[i])
      escreva("Preco de Compra: ")
      leia(precoCompra[i])
      escreva("Preco de Venda: ")
      leia(precoVenda[i])
   fimpara
   escreval

   abaixo <- 0
   entre <- 0
   acima <- 0
   para i de 0 ate N-1 faca
      lucro <- precoVenda[i] - precoCompra[i]
      percentual <- lucro * 100 / precoCompra[i]

      se percentual < 10 entao
         abaixo <- abaixo + 1
      senao
         se percentual <= 20 entao
            entre <- entre + 1
         senao
            acima <- acima + 1
         fimse
      fimse
   fimpara

   para i de 0 ate N-1 faca
      totalCompra <- totalCompra + precoCompra[i]
      totalVenda <- totalVenda + precoVenda[i]
      totalLucro <- totalLucro + (precoVenda[i] - precoCompra[i])
   fimpara

   escreval("* Relatório")
   escreval("Lucro abaixo de 10%: ", abaixo)
   escreval("Lucro entre 10% e 20%: ", entre)
   escreval("Lucro acima de 20%: ", acima)
   escreval("Total de Compra: ", totalCompra:3:2)
   escreval("Total de Venda: ", totalVenda:3:2)
   escreval("Total de Lucro: ", totalLucro:3:2)

Fimalgoritmo