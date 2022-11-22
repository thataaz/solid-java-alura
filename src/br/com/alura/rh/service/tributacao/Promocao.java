package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements Reajuste {

    private BigDecimal valor;
    private LocalDate data;

    public Promocao(BigDecimal valor) {
        this.valor = valor;
        this.data = LocalDate.now();
    }

    @Override
    public BigDecimal valor() {
        return valor;
    }

    @Override
    public LocalDate data() {
        return data;
    }

    /*@Override
    public BigDecimal valorImpostoDeRenda() {
        return valor.multiply(new BigDecimal("0.1"));
    }*/ //preciso implementar na Interface, porém todos terão que ter esse método mesmo que não faca sentido...
    // Pra isso tem o principio da Segregracão de interface

}
