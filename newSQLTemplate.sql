
CREATE TABLE panda(
    cod_usuario SERIAL PRIMARY KEY,
    login VARCHAR(200)NOT NULL,
    senha VARCHAR(200)NOT NULL
);

INSERT INTO panda
(login, senha)VALUES
('ADRIAN', '12E3');

SELECT *
FROM panda;

DELETE FROM panda
WHERE cod_usuario = 4;