CREATE DATABASE IF NOT EXISTS poo_ii CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE poo_ii;
CREATE TABLE IF NOT EXISTS alunos (id INT PRIMARY KEY, nome VARCHAR(120) NOT NULL, email VARCHAR(160) NOT NULL);
INSERT INTO alunos (id,nome,email) VALUES
(1,'João Silva','joao@example.com'),
(2,'Maria Oliveira','maria@example.com'),
(3,'Carlos Souza','carlos@example.com')
ON DUPLICATE KEY UPDATE nome=VALUES(nome), email=VALUES(email);
