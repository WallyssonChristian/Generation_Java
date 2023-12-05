CREATE DATABASE db_e_commerce;

USE db_e_commerce;

CREATE TABLE tb_produtos(
id bigint auto_increment,
nome varchar(255) NOT NULL,
preco decimal(10,2) NOT NULL,
estoque INT,
categoria varchar(255) NOT NULL,
PRIMARY KEY (id)
);

INSERT INTO tb_produtos(nome, preco, estoque, categoria)
VALUES ('Smartphone Modelo X', 899.99, 50, 'Eletrônicos'),
('Notebook Ultra Y', 1299.99, 30, 'Informática'),
('Fone de Ouvido Sem Fio', 79.99, 100, 'Acessórios Eletrônicos'),
('Tênis Esportivo Modelo Z', 129.99, 20, 'Moda Esportiva'),
('Câmera Digital Profissional', 1499.99, 15, 'Fotografia'),
('Liquidificador Potente', 59.99, 40, 'Eletrodomésticos'),
('Livro: Aventuras do Mundo', 19.99, 75, 'Livros'),
('Cadeira de Escritório Ergonômica', 199.99, 10, 'Móveis');

SELECT *
FROM tb_produtos
WHERE preco > 500;

SELECT *
FROM tb_produtos
WHERE preco < 500;

UPDATE tb_produtos
SET preco = 949.99
WHERE nome = 'Smartphone Modelo X';
