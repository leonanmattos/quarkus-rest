 ----------------------------------------------------------
 ------------------------- USUÁRIO ENTIDADE ------------------------
 ----------------------------------------------------------

-- SEQUENCE: sq_usuario_entidade
-- DROP SEQUENCE sa_rest.sq_usuario_entidade;
CREATE SEQUENCE sa_rest.sq_usuario_entidade
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;

-- TABLE: tb_usuario_entidade
-- DROP TABLE sa_rest.tb_usuario_entidade;
CREATE TABLE sa_rest.tb_usuario_entidade (
	id_usuario_entidade BIGINT NOT NULL DEFAULT nextval('sa_rest.sq_usuario_entidade'::regclass),
	id_entidade BIGINT NOT NULL,
    id_usuario BIGINT NOT NULL,
    id_perfil BIGINT NOT NULL,
    nome_documento VARCHAR(200) NOT NULL,
    dt_solicitacao DATETIME NOT NULL,
    ind_autorizacao BIGINT NOT NULL,
    observacao VARCHAR(100) NOT NULL,
    --cpf_usuario_criacao VARCHAR(11) NOT NULL,
    --cpf_usuario_alteracao VARCHAR(11),
    --dt_criacao DATETIME NOT NULL,
    --dt_ultima_alteracao DATETIME,
    CONSTRAINT tb_usuario_entidade_pkey PRIMARY KEY (id_usuario_entidade),
    CONSTRAINT fk_entidade FOREIGN KEY (id_entidade) REFERENCES tb_entidade(id_entidade),
    CONSTRAINT fk_usuario FOREIGN KEY (id_usuario) REFERENCES tb_usuario(id_usuario),
    CONSTRAINT fk_perfil FOREIGN KEY (id_perfil) REFERENCES tb_perfil(id_perfil)
);