--popular tabelas
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