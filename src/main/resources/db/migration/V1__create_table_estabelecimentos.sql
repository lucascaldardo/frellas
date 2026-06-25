CREATE TABLE Evento(
    id BIGSERIAL PRIMARY KEY NOT NULL ,
    nome VARCHAR(255),
    descricao TEXT,
    identificador VARCHAR(255) NOT NULL ,
    data_inicio TIMESTAMP NOT NULL,
    data_fim TIMESTAMP NOT NULL,
    local_evento VARCHAR(255),
    capacidade INTEGER NOT NULL,
    organizador VARCHAR(255),
    tipo VARCHAR(50) NOT NULL
);