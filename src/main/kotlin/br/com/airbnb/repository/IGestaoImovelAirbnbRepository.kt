package br.com.airbnb.repository

import br.com.airbnb.domain.TabelaGestaoImovelAirbnb
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface IGestaoImovelAirbnbRepository : JpaRepository<TabelaGestaoImovelAirbnb, UUID> {
}