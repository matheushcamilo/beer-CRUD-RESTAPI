package com.digitalinnovationone.beerDIO.enums;

public enum BeerType {

    LAGER("Lager"),
    PILSEN("Pilsen"),
    PALE("Pale"),
    BOCK("Bock"),
    WEISSBIER("Weissbier");

    private String tipo;

    BeerType(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
