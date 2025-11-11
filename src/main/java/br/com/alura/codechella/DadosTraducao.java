package br.com.alura.codechella;

import java.util.List;

public record DadosTraducao(DadosResposta responseData) {

    public String getTexto() {
        return this.responseData.translatedText();
    }
}