package com.tms.inheritance_encapsulation_polymorphism.additional_tasks.task_1.models;

import com.tms.inheritance_encapsulation_polymorphism.mandatory_tasks.task_0.models.IVector;
import com.tms.inheritance_encapsulation_polymorphism.mandatory_tasks.task_0.models.Vector2D;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Vector {

    private double[] coordinates;

    public Vector(double... coordinates) {
        this.coordinates = coordinates;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public double length() {
        double sumOfSquares = 0;
        for (double coordinate : coordinates) {
            sumOfSquares += Math.pow(coordinate, 2);
        }

        return Math.sqrt(sumOfSquares);
    }

    public double dotProduct(Vector vector2) {
        double dotProduct = 0;
        for (int i = 0; i < coordinates.length; i++) {
            dotProduct = this.coordinates[i] * vector2.getCoordinates()[i];
        }

        return dotProduct;
    }

    public Vector add(Vector vector2) {
        double[] newCoordinates = new double[coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            newCoordinates[i] = this.coordinates[i] + vector2.getCoordinates()[i];
        }

        return new Vector(newCoordinates);
    }

    public Vector sub(Vector vector2) {
        double[] newCoordinates = new double[this.coordinates.length];
        for (int i = 0; i < coordinates.length; i++) {
            newCoordinates[i] = this.coordinates[i] - vector2.getCoordinates()[i];
        }

        return new Vector(newCoordinates);
    }

    public static Vector[] generateRandomVectors(int N, int numberOfCoordinates) {
        Vector[] vectors = new Vector[N];
        for (int i = 0; i < N; i++) {
            double[] newCoordinates = new double[numberOfCoordinates];
            for (int j = 0; j < newCoordinates.length; j++) {
                newCoordinates[j] = Math.random() * 101;
            }
            vectors[i] = new Vector(newCoordinates);
        }

        return vectors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector vector)) return false;
        return Arrays.equals(coordinates, vector.coordinates);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coordinates);
    }

    @Override
    public String toString() {
        return "Vector{coordinates=" +
                Arrays.stream(coordinates)
                        .mapToObj(d -> String.format("%.1f", d))
                        .collect(Collectors.joining(", ")) +
                '}';
    }
}
