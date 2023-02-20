package me.yoursole.Numerical;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.function.BiConsumer;

@AllArgsConstructor
public enum MultiplicationStrategy {
;



    @Getter
    private final BiConsumer<Numerical, Numerical> operation;

}
