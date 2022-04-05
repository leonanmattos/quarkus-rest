 ----------------------------------------------------------
 ------------------------- PERFIL -------------------------
 ----------------------------------------------------------

-- SEQUENCE: sq_perfil
-- DROP SEQUENCE sa_rest.sq_perfil;
CREATE SEQUENCE sa_rest.sq_perfil
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;

-- TABLE: tb_perfil
-- DROP TABLE sa_rest.tb_perfil;
CREATE TABLE sa_rest.tb_perfil (
	id_perfil BIGINT NOT NULL DEFAULT nextval('sa_rest.sq_perfil'::regclass),
	nome_perfil VARCHAR(50) NOT NULL,
    situacao BOOL NOT NULL,
	CONSTRAINT tb_perfil_pkey PRIMARY KEY (id_perfil)
);