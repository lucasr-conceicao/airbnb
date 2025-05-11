package br.com.airbnb.adapters.handler

import org.springframework.http.HttpStatus
import java.time.LocalDateTime

data class JsonHandler(
    var data: LocalDateTime? = null,
    var httpStatusCode: Int? = null,
    var httpStatus: HttpStatus? = null,
    var path: String,
    var mensagem: String
)