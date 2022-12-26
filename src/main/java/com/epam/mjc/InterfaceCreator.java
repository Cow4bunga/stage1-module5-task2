package com.epam.mjc;

import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return num -> num.stream().
                map(item -> item / divider).
                collect(Collectors.toList());
    }
}
