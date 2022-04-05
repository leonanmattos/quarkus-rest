 ----------------------------------------------------------
 ------------------------- CONTRATO -----------------------
 ----------------------------------------------------------

-- SEQUENCE: sq_contrato
-- DROP SEQUENCE sa_rest.sq_contrato;
CREATE SEQUENCE sa_rest.sq_contrato
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;

-- TABLE: tb_contrato
-- DROP TABLE sa_rest.tb_contrato;
CREATE TABLE sa_rest.tb_contrato (
	id_contrato BIGINT NOT NULL DEFAULT nextval('sa_rest.sq_contrato'::regclass),
	id_entidade BIGINT NOT NULL,
	termo_contrato VARCHAR(15) NOT NULL,
    dt_inicio_operacao DATE NOT NULL,
	CONSTRAINT tb_contrato_pkey PRIMARY KEY (id_contrato),
    CONSTRAINT fk_entidade FOREIGN KEY (id_entidade) REFERENCES tb_entidade(id_entidade)
);