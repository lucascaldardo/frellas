package lucas.evento.infrastructure.gateway;

import lucas.evento.core.entites.Evento;
import lucas.evento.core.gateway.EventoGateway;
import lucas.evento.infrastructure.persistence.EventoRepository;
import org.springframework.stereotype.Component;

@Component
public class EventoRepositoryGateway implements EventoGateway {

    private final EventoRepository eventoRepository;

    public EventoRepositoryGateway(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    @Override
    public Evento criarEvento(Evento evento) {
        return eventoRepository.save(evento);
    }
}
