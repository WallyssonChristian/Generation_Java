CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_colaboradores(
id bigint auto_increment,
nome varchar(255) NOT NULL,
cargo varchar(255) NOT NULL,
email VARCHAR(100),
salario decimal(10,2) NOT NULL,
PRIMARY KEY (id)
);

INSERT INTO tb_colaboradores(nome, cargo, email, salario)
VALUES ('João Silva', 'Desenvolvedor Web', 'joao.silva@email.com', '5000.00'),
('Maria Oliveira', 'Analista de Marketing', 'maria.oliveira@email.com', '4500.00'),
('Carlos Santos', 'Gerente de Projetos', 'carlos.santos@email.com', '7000.00'),
('Ana Costa', 'Designer Gráfico', 'ana.costa@email.com', '4800.00'),
('Rafael Pereira', 'Analista de Sistemas', 'rafael.pereira@email.com', '5500.00'),
('Fernanda Lima', 'Estagiário', 'fernanda.lima@email.com', '1500.00'),
('Paulo Rocha', 'Assistente Administrativo', 'paulo.rocha@email.com', '1800.00'),
('Amanda Souza', 'Suporte Técnico', 'amanda.souza@email.com', '1900.00');

SELECT *
FROM tb_colaboradores
WHERE salario > 2000;

SELECT *
FROM tb_colaboradores
WHERE salario < 2000;

UPDATE tb_colaboradores
SET salario = 1980.00
WHERE nome = 'Amanda Souza';
