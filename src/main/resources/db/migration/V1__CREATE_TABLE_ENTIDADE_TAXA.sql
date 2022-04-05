 ----------------------------------------------------------
 ------------------------- ENTIDADE TAXA ------------------
 ----------------------------------------------------------

-- SEQUENCE: sq_entidade_taxa
-- DROP SEQUENCE sa_rest.sq_entidade_taxa;
CREATE SEQUENCE sa_rest.sq_entidade_taxa
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;

-- TABLE: tb_entidade_taxa
-- DROP TABLE sa_rest.tb_entidade_taxa;
CREATE TABLE sa_rest.tb_entidade_taxa (
	id_entidade_taxa BIGINT NOT NULL DEFAULT nextval('sa_rest.sq_entidade_taxa'::regclass),
	id_entidade BIGINT NOT NULL,
	id_taxa BIGINT NOT NULL,
	CONSTRAINT tb_entidade_taxa_pkey PRIMARY KEY (id_entidade_taxa),
    CONSTRAINT fk_taxa FOREIGN KEY (id_taxa) REFERENCES tb_taxa(id_taxa),
    CONSTRAINT fk_entidade FOREIGN KEY (id_entidade) REFERENCES tb_entidade(id_entidade)
);