CREATE TABLE usuario (
    id     int PRIMARY KEY,
    nome   varchar(100)
);

CREATE TABLE assistidos (
    idUsuario int,
    idFilme   int
);

CREATE TABLE interesse (
    idUsuario int,
    idFilme   int
);


INSERT INTO USUARIO (id, nome) VALUES (1, 'Bruno Cavalcante');
INSERT INTO USUARIO (id, nome) VALUES (2, 'Felipe Gonzalez');
INSERT INTO USUARIO (id, nome) VALUES (3, 'Gabriel Muniz');


INSERT INTO ASSISTIDOS (idUsuario, idFilme) VALUES (1, 1);
INSERT INTO ASSISTIDOS (idUsuario, idFilme) VALUES (1, 2);
INSERT INTO ASSISTIDOS (idUsuario, idFilme) VALUES (2, 1);
INSERT INTO ASSISTIDOS (idUsuario, idFilme) VALUES (2, 2);
INSERT INTO ASSISTIDOS (idUsuario, idFilme) VALUES (3, 1);
INSERT INTO ASSISTIDOS (idUsuario, idFilme) VALUES (3, 2);

INSERT INTO INTERESSE (idUsuario, idFilme) VALUES (1, 1);
INSERT INTO INTERESSE (idUsuario, idFilme) VALUES (1, 2);
INSERT INTO INTERESSE (idUsuario, idFilme) VALUES (2, 1);
INSERT INTO INTERESSE (idUsuario, idFilme) VALUES (2, 2);
INSERT INTO INTERESSE (idUsuario, idFilme) VALUES (3, 1);
INSERT INTO INTERESSE (idUsuario, idFilme) VALUES (3, 2);

