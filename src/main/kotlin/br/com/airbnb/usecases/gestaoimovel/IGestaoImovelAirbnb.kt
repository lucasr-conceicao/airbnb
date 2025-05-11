package br.com.airbnb.usecases.gestaoimovel

import br.com.airbnb.adapters.dtos.imovelairbnbdto.GestaoImovelAirbnbDtoRequest

interface IGestaoImovelAirbnb {
    fun executar(request: GestaoImovelAirbnbDtoRequest)
}