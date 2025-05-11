package br.com.airbnb.domain

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "tb_gest_imvo_airbnb")
data class TabelaGestaoImovelAirbnb (

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: UUID? = null
)