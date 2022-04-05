 ----------------------------------------------------------
 ------------------------- LOG_USUARIO --------------------
 ----------------------------------------------------------

-- SEQUENCE: sq_log_usuario
-- DROP SEQUENCE sa_rest.sq_log_usuario;
CREATE SEQUENCE sa_rest.sq_log_usuario
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;

-- TABLE: tb_log_usuario
-- DROP TABLE sa_rest.tb_log_usuario;
CREATE TABLE sa_rest.tb_log_usuario (
	id_log_usuario BIGINT NOT NULL DEFAULT nextval('sa_rest.sq_log_usuario'::regclass),
	id_usuario BIGINT NOT NULL,
    cpf_responsavel VARCHAR(11) NOT NULL,
    dt_registro DATETIME NOT NULL,
	CONSTRAINT tb_log_usuario_pkey PRIMARY KEY (id_log_usuario),
    CONSTRAINT fk_usuario FOREIGN KEY (id_usuario) REFERENCES tb_usuario(id_usuario)
);