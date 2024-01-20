package com.tictactoe;

public enum Sign {
    EMPTY(' '),
    CROSS('X'),
    NOUGHT('O');

    private final char sign;

    Sign(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }
}