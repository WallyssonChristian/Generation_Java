CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_estudantes(
id bigint auto_increment,
Nome varchar(255) NOT NULL,
DataNascimento DATE,
AnoMatricula INT,
Email varchar(255) NOT NULL,
Nota FLOAT,
PRIMARY KEY (id)
);

INSERT INTO tb_estudantes (Nome, DataNascimento, AnoMatricula, Email, Nota)
VALUES
    ('Maria Silva', '2005-03-15', 8, 'maria.silva@email.com', 8.5),
    ('Pedro Oliveira', '2004-06-22', 9, 'pedro.oliveira@email.com', 6.2),
    ('Ana Santos', '2006-01-10', 7, 'ana.santos@email.com', 9.0),
    ('Carlos Rocha', '2005-08-05', 8, 'carlos.rocha@email.com', 7.8),
    ('Juliana Costa', '2004-11-30', 9, 'juliana.costa@email.com', 5.5),
    ('Rafael Pereira', '2006-04-18', 7, 'rafael.pereira@email.com', 8.7),
    ('Fernanda Lima', '2005-06-12', 8, 'fernanda.lima@email.com', 6.9),
    ('Lucas Souza', '2004-09-25', 9, 'lucas.souza@email.com', 8.2);
    
SELECT *
FROM tb_estudantes
WHERE Nota > 7.0;

SELECT *
FROM tb_estudantes
WHERE Nota < 7.0;

UPDATE tb_estudantes
SET Nota = 7.5
WHERE ID_Estudante = 2;