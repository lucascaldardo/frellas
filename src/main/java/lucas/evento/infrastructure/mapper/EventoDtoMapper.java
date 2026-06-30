package lucas.evento.infrastructure.mapper;


import lucas.evento.core.entites.Evento;
import lucas.evento.infrastructure.dto.EventoDTO;
import org.springframework.stereotype.Component;

@Component
public class EventoDtoMapper {
        public EventoDTO toDto(Evento evento){
            return new EventoDTO(
                    evento.id(),
                    evento.nome(),
                    evento.descricao(),
                    evento.identificador(),
                    evento.dataInicio(),
                    evento.dataFim(),
                    evento.localEvento(),
                    evento.capacidade(),
                    evento.organizador(),
                    evento.tipoEvento()
            );
}
    public Evento toDomain(EventoDTO eventoDTO){
            return new Evento(
                    eventoDTO.id(),
                    eventoDTO.nome(),
                    eventoDTO.descricao(),
                    eventoDTO.identificador(),
                    eventoDTO.dataInicio(),
                    eventoDTO.dataFim(),
                    eventoDTO.localEvento(),
                    eventoDTO.capacidade(),
                    eventoDTO.organizador(),
                    eventoDTO.tipoEvento()
            );
    }

}

