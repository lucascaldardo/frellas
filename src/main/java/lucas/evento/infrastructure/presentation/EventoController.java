package lucas.evento.infrastructure.presentation;

import lucas.evento.infrastructure.dto.EventoDTO;
import lucas.evento.infrastructure.persistence.EventoEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class EventoController {

    @PostMapping("criarevento")
    public String criarEvento(@RequestBody EventoDTO evento){
        return "Evento criado";
    }

}
