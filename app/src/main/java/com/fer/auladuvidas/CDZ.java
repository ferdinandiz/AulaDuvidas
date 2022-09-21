package com.fer.auladuvidas;

class CDZ {
    private String nome, constelacao, id;

    public CDZ() {
    }

    public CDZ(String nome, String constelacao, String id) {
        this.nome = nome;
        this.constelacao = constelacao;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConstelacao() {
        return constelacao;
    }

    public void setConstelacao(String constelacao) {
        this.constelacao = constelacao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

