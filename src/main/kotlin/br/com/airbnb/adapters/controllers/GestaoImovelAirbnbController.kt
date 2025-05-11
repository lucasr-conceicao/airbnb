package br.com.airbnb.adapters.controllers

import br.com.airbnb.adapters.dtos.imovelairbnbdto.GestaoImovelAirbnbDtoRequest
import br.com.airbnb.usecases.gestaoimovel.IGestaoImovelAirbnb
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/gestao-imovel-airbnb/v1")
class GestaoImovelAirbnbController(val gestaoImovelAirbnb: IGestaoImovelAirbnb) {

    @PostMapping
    fun cadastrarImovelAirbnb(@RequestBody dto: GestaoImovelAirbnbDtoRequest): ResponseEntity<Unit> {
        gestaoImovelAirbnb.executar(dto)
        return ResponseEntity(HttpStatus.CREATED)
    }
}