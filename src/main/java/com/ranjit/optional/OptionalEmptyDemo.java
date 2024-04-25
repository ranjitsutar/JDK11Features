package com.ranjit.optional;

import java.util.Optional;

public class OptionalEmptyDemo {
    public static void main(String[] args) {
        Optional optional= Optional.of("  ");

        optional = optional.empty();
        System.out.println(optional.isEmpty());


    }
}
