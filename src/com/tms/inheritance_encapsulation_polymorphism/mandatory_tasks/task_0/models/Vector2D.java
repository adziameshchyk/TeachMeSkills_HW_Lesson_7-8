package com.tms.inheritance_encapsulation_polymorphism.mandatory_tasks.task_0.models;

import java.util.Objects;

public class Vector2D implements IVector {

    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    @Override
    public double dotProduct(IVector vector) {
        Vector2D vector2 = (Vector2D) vector;
        return this.x * vector2.getX() + this.y * vector2.getY();
    }

    @Override
    public IVector add(IVector vector) {
        Vector2D vector2 = (Vector2D) vector;
        return new Vector2D(this.x + vector2.getX(), this.y + vector2.getY());
    }

    @Override
    public IVector sub(IVector vector) {
        Vector2D vector2 = (Vector2D) vector;
        return new Vector2D(this.x - vector2.getX(), this.y - vector2.getY());
    }

    public static IVector[] generateRandomVectors(int N) {
        Vector2D[] vectors = new Vector2D[N];

        for (int i = 0; i < N; i++) {
            vectors[i] = new Vector2D(Math.random() * 101, Math.random() * 101);
        }
        return vectors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector2D vector2D)) return false;
        return Double.compare(vector2D.x, x) == 0 && Double.compare(vector2D.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Vector2D{" +
                "x=" + String.format("%.1f", x) +
                ", y=" + String.format("%.1f", y) +
                '}';
    }

}
