CREATE DATABASE db_cidade_das_carnes;

USE db_cidade_das_carnes;

CREATE TABLE tb_categorias (
    id_categoria INT PRIMARY KEY AUTO_INCREMENT,
    nome_categoria VARCHAR(50) NOT NULL,
    descricao_categoria VARCHAR(255)
);

CREATE TABLE tb_produtos (
    id_produto INT PRIMARY KEY AUTO_INCREMENT,
    nome_produto VARCHAR(50) NOT NULL,
    preco DECIMAL(10, 2) NOT NULL,
    quantidade_estoque INT NOT NULL,
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria)
);

INSERT INTO tb_categorias (nome_categoria, descricao_categoria)
VALUES
    ('Carnes Bovinas', 'Cortes variados de carne de boi'),
    ('Aves', 'Frangos e outras aves'),
    ('Suínos', 'Carnes de porco e derivados'),
    ('Embutidos', 'Salsichas, linguiças e presuntos'),
    ('Peixes', 'Variedade de peixes frescos e frutos do mar');
    
INSERT INTO tb_produtos (nome_produto, preco, quantidade_estoque, id_categoria)
VALUES
    ('Picanha Premium', 29.99, 50, 1),      -- Carnes Bovinas
    ('Coxa e Sobrecoxa', 9.99, 100, 2),     -- Aves
    ('Costelinha de Porco', 14.99, 30, 3),  -- Suínos
    ('Linguiça Toscana', 7.99, 80, 4),      -- Embutidos
    ('Salmão Fresco', 24.99, 20, 5),         -- Peixes
    ('Alcatra', 22.99, 40, 1),               -- Carnes Bovinas
    ('Peito de Frango', 6.99, 120, 2),       -- Aves
    ('Lombo Suíno', 18.99, 25, 3);           -- Suínos
    
SELECT *
FROM tb_produtos
WHERE preco > 20;

SELECT *
FROM tb_produtos
WHERE preco BETWEEN 10 AND 20;

SELECT *
FROM tb_produtos
WHERE nome_produto LIKE '%c%';

SELECT p.*, c.nome_categoria
FROM tb_produtos p
INNER JOIN tb_categorias c ON p.id_categoria = c.id_categoria;

SELECT p.*, c.nome_categoria
FROM tb_produtos p
INNER JOIN tb_categorias c ON p.id_categoria = c.id_categoria
WHERE c.id_categoria = 2;