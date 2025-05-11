package br.com.airbnb.adapters.handler

import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.time.LocalDateTime

@RestControllerAdvice
class ControllerHandler {

    @ExceptionHandler(RuntimeException::class)
    private fun handlerRecursoNaoEncontradoException(ex: RuntimeException, httpServlet: HttpServletRequest): ResponseEntity<JsonHandler> {
        return montarRetorno(HttpStatus.INTERNAL_SERVER_ERROR, HttpStatus.INTERNAL_SERVER_ERROR.value(), httpServlet.requestURI, ex.localizedMessage)
    }

    private fun montarRetorno(httpStatus: HttpStatus, code: Int, path: String, mensagem: String): ResponseEntity<JsonHandler> {
        return ResponseEntity(JsonHandler(LocalDateTime.now(), code, httpStatus, path, mensagem), httpStatus)
    }
}