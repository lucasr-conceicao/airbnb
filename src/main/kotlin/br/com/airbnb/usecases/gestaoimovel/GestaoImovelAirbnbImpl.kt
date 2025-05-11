package br.com.airbnb.usecases.gestaoimovel

import br.com.airbnb.adapters.dtos.imovelairbnbdto.GestaoImovelAirbnbDtoRequest
import br.com.airbnb.repository.IGestaoImovelAirbnbRepository
import org.springframework.stereotype.Service

@Service
class GestaoImovelAirbnbImpl(val repository: IGestaoImovelAirbnbRepository): IGestaoImovelAirbnb {

    override fun executar(request: GestaoImovelAirbnbDtoRequest) {
        TODO("Not yet implemented")
    }
}