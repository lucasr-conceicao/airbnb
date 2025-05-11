package br.com.airbnb.adapters.dtos.imovelairbnbdto

data class GestaoImovelAirbnbDtoRequest (
    val tipoImovel: Int? = null,
    val quantidadeDeQuartos: Int? = null,
    val quantidadeDeBanheiro: Int? = null,
    val quantidadeDeCozinha: Int? = null,
)