# ELEICOES

# ALGORITMO

inicio
    
    enquanto existe pessoas para votar faça
        escreva("Escolha quem votar:")
        escreva(" 1 - (13) PT")
        escreva(" 2 - (12) PDT")
        escreva(" 3 - (22) PL")
        escreva(" 4 - (45) PSDB")
        escreva(" 5 - voto nulo")
        escreva(" 6 - voto em branco")
        ler voto
        
        escolha voto
            caso 1 faça
                escreva("VOCÊ VOTOU NO (13) PT")
                pt++
            fimcaso

            caso 2 faça{
                escreva("VOCÊ VOTOU NO (12) PDT")
                pdt++
            fimcaso

            caso 3 faça
                escreva("VOCÊ VOTOU NO (22) PL")
                pl++
            fimcaso

            caso 4 faça
                escreva("VOCÊ VOTOU NO (45) PSDB")
                psdb++
            fimcaso

            caso 5 faça
                escreva("VOCÊ VOTOU NULO")
                nulo++
            fimcaso

            caso 6 faça
                escreva("VOCÊ VOTOU EM BRANCO")
                branco++
            fimcaso	
        fimescolha

        escrava(total de votos, nulos e brancos)
fim


# FLUXOGRAMA

![Fluxograma Eleições](https://user-images.githubusercontent.com/104398779/169935998-1c2f82eb-8cfc-4a7a-bb31-1b8a35748349.png)
