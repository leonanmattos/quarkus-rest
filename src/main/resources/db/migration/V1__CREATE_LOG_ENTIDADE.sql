 ----------------------------------------------------------
 ------------------------- LOG ENTIDADE --------------------
 ----------------------------------------------------------

-- SEQUENCE: sq_log_entidade
-- DROP SEQUENCE sa_rest.sq_log_entidade;
CREATE SEQUENCE sa_rest.sq_log_entidade
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;

-- TABLE: tb_log_entidade
-- DROP TABLE sa_rest.tb_log_entidade;
CREATE TABLE sa_rest.tb_log_entidade (
	id_log_entidade BIGINT NOT NULL DEFAULT nextval('sa_rest.sq_log_entidade'::regclass),
	id_entidade BIGINT NOT NULL,
	cpf_responsavel_registro VARCHAR(11) NOT NULL,
    ind_autorizacao SMALLINT NOT NULL,
    observacao VARCHAR(100) NOT NULL,
    dt_registro DATETIME NOT NULL,
	CONSTRAINT tb_log_entidade_pkey PRIMARY KEY (id_log_entidade),
    CONSTRAINT fk_entidade FOREIGN KEY (id_entidade) REFERENCES tb_entidade(id_entidade)
);