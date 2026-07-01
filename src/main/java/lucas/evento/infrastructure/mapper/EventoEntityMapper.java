package lucas.evento.infrastructure.mapper;

import lucas.evento.core.entites.Evento;
import lucas.evento.infrastructure.persistence.EventoEntity;
import org.springframework.stereotype.Component;

@Component
public class EventoEntityMapper {

    public EventoEntity toEntity(Evento evento){
        return new EventoEntity(
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

    public Evento toDomain(EventoEntity eventoEntity){
        return new Evento(
                eventoEntity.getId(),
                eventoEntity.getNome(),
                eventoEntity.getDescricao(),
                eventoEntity.getIdentificador(),
                eventoEntity.getDataInicio(),
                eventoEntity.getDataFim(),
                eventoEntity.getLocalEvento(),
                eventoEntity.getCapacidade(),
                eventoEntity.getOrganizador(),
                eventoEntity.getTipoEvento()
        );
    }

}
