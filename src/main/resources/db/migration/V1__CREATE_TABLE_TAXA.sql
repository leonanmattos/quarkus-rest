 ----------------------------------------------------------
 ------------------------- TAXA ---------------------------
 ----------------------------------------------------------

-- SEQUENCE: sq_taxa
-- DROP SEQUENCE sa_rest.sq_taxa;
CREATE SEQUENCE sa_rest.sq_taxa
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;

-- TABLE: tb_taxa
-- DROP TABLE sa_rest.tb_taxa;
CREATE TABLE sa_rest.tb_taxa (
	id_taxa BIGINT NOT NULL DEFAULT nextval('sa_rest.sq_taxa'::regclass),
	nome_taxa VARCHAR(100) NOT NULL,
	dt_inicio_vigencia DATE NOT NULL,
    dt_fim_vigencia DATE NOT NULL,
    percentual_taxa NUMERIC(6,3) NOT NULL,
    situacao BOOL NOT NULL,
	CONSTRAINT tb_taxa_pkey PRIMARY KEY (id_taxa)
);