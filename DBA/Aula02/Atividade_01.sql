CREATE DATABASE db_generation_game_online;

use db_generation_game_online;

CREATE TABLE tb_classes (
	id_classe INT PRIMARY KEY AUTO_INCREMENT,
	nome_classe VARCHAR(50) NOT NULL,
    atributo_principal VARCHAR(50) NOT NULL,
    habilidade_especial VARCHAR(100)
);
CREATE TABLE tb_personagens(
	id_personagem INT PRIMARY KEY AUTO_INCREMENT,
    nome_personagem VARCHAR(50) NOT NULL,
    nivel INT,
    experiencia INT,
    id_classe INT,
    FOREIGN KEY (id_classe) REFERENCES tb_classes(id_classe)
);

SELECT * FROM tb_classes;

INSERT INTO tb_classes (nome_classe, atributo_principal, habilidade_especial)
VALUES
    ('Bárbaro', 'Força', 'Fúria'),
    ('Bardo', 'Carisma', 'Inspiração de Bardo'),
    ('Bruxo', 'Carisma', 'Patrono Transcendental'),
    ('Clérigo', 'Sabedoria', 'Canalizar Divindade'),
    ('Druida', 'Sabedoria', 'Forma Selvagem'),
    ('Feiticeiro', 'Carisma', 'Metamágica'),
    ('Guerreiro', 'Força', 'Retomar o Fôlego'),
    ('Ladino', 'Destreza', 'Furtividade'),
    ('Mago', 'Inteligência', 'Bola de Fogo'),
    ('Monge', 'Deztreza', 'Chi'),
    ('Paladino', 'Carisma', 'Destruição Divina'),
    ('Patrulheiro', 'Destreza', 'Inimigo Favorito');
    
INSERT INTO tb_personagens (nome_personagem, nivel, experiencia, id_classe)
VALUES
	('Gorn, o Selvagem', 8, 3500, 1),
    ('Aria, a Encantadora', 5, 2000, 1),
   
    ('Rhys, o Trovador', 5, 1800, 2),
    ('Eowyn, a Melodiosa', 8, 3800, 2),
    
    ('Malik, o Invocador', 8, 3800, 3),
    ('Lilith, a Sombria', 10, 5500, 3),
    
    ('Elena, a Curandeira', 4, 1800, 4),
    ('Rurik, o Redentor', 8, 3500, 4),
    
    ('Thorin, o Adepto', 6, 2700, 5),
    ('Elara, a Selvagem', 9, 4200, 5),
    
	('Alduin, o Dragão Sombrio', 11, 6000, 6),
    ('Luna, a Feiticeira Lunar', 7, 3200, 6),
    
    ('Ulfar, o Indomável', 12, 8000, 1),
    ('Freya, a Destemida', 9, 4500, 1),
    
    ('Kara, a Furtiva', 6, 2400, 8),
    ('Cassius, o Ladrão das Sombras', 9, 4100, 8),
    
    ('Lyra, a Harmônica', 6, 2500, 9), 
    ('Eldor, o Elementalista', 9, 4000, 9),

    ('Khalid, o Monástico', 8, 3600, 10),
    ('Sona, a Serena', 5, 2000, 10),

    ('Isolde, a Devota', 11, 5500, 11),
    ('Roland, o Purificador', 7, 3200, 11),
    
	('Sylas, o Atirador', 7, 3000, 12),
    ('Fiona, a Flecha Rápida', 10, 5000, 12);
    
SELECT *
FROM tb_personagens
WHERE experiencia > 3000;

SELECT *
FROM tb_personagens
WHERE nivel BETWEEN 5 AND 8;

SELECT *
FROM tb_personagens
WHERE nome_personagem LIKE '%C%';

SELECT p.*, c.nome_classe, c.atributo_principal, c.habilidade_especial
FROM tb_personagens p
INNER JOIN tb_classes c ON p.id_classe = c.id_classe;

SELECT p.*, c.nome_classe
FROM tb_personagens p
INNER JOIN tb_classes c ON p.id_classe = c.id_classe
WHERE c.id_classe = 9;