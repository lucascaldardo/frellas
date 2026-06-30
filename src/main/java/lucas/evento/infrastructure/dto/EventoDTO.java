package lucas.evento.infrastructure.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lucas.evento.core.enums.TipoEvento;

import java.time.LocalDateTime;

public record EventoDTO (

      Long id,

     String nome,

     String descricao,

     String identificador,

     LocalDateTime dataInicio,

     LocalDateTime dataFim,

     String localEvento,

     Integer capacidade,

     String organizador,

     TipoEvento tipoEvento
)
    {}
