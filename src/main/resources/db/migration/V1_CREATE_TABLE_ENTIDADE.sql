 ----------------------------------------------------------
 ------------------------- ENTIDADE ------------------------
 ----------------------------------------------------------

-- SEQUENCE: sq_entidade
-- DROP SEQUENCE sa_rest.sq_entidade;
CREATE SEQUENCE sa_rest.sq_entidade
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;

-- TABLE: tb_entidade
-- DROP TABLE sa_rest.tb_entidade;
CREATE TABLE sa_rest.tb_entidade (
	id_entidade BIGINT NOT NULL DEFAULT nextval('sa_rest.sq_entidade'::regclass),
	nome_entidade VARCHAR(150) NOT NULL,
	cnpj VARCHAR(14) NOT NULL,
    email VARCHAR(100) NOT NULL,
    cep VARCHAR(8) NULL,
    logradouro VARCHAR(150) NULL,
    num_logradouro VARCHAR(10) NULL,
    complemento VARCHAR(150) NULL,
    bairro VARCHAR(100) NULL,
    municipio VARCHAR(100) NULL,
    sigla_uf VARCHAR(2) NULL,
    num_telefone_principal VARCHAR(15) NULL,
    num_telefone_secundario VARCHAR(15) NULL,
    situacao_autorizacao BOOL NOT NULL,
    observacao VARCHAR(150) NULL,
    situacao BOOL NOT NULL,
    dt_solicitacao DATETIME NOT NULL,
    cpf_usuario_criacao VARCHAR(11) NOT NULL,
    cpf_usuario_alteracao VARCHAR(11) NULL,
    dt_criacao DATETIME NOT NULL,
    dt_alteracao DATETIME NULL,
	CONSTRAINT tb_entidade_pkey PRIMARY KEY (id_entidade)
);