package com.tms.inheritance_encapsulation_polymorphism.models;

public interface IVector {

    double length();
    double dotProduct(IVector vector);
    IVector add(IVector vector);
    IVector sub(IVector vector);

    /*метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt();
    метод, вычисляющий скалярное произведение;
    метод сложения векторов;
    метод разности векторов;
    статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.*/
}
