package com.github.stawirej.fluentapi.example.dslgeneric.medicalcenter;

public interface To<T, R> {

    At<R> to(T value);
}