package com.tms.inheritance_encapsulation_polymorphism.mandatory_tasks.task_0.models;

import java.util.Objects;

public class Vector3D implements IVector {

    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public double length() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    @Override
    public double dotProduct(IVector vector) {
        Vector3D vector2 = (Vector3D) vector;
        return this.x * vector2.getX() + this.y * vector2.getY() + this.z * vector2.getZ();
    }

    @Override
    public IVector add(IVector vector) {
        Vector3D vector2 = (Vector3D) vector;
        return new Vector3D(this.x + vector2.getX(), this.y + vector2.getY(), this.z + vector2.getZ());
    }

    @Override
    public IVector sub(IVector vector) {
        Vector3D vector2 = (Vector3D) vector;
        return new Vector3D(this.x - vector2.getX(), this.y - vector2.getY(), this.z - vector2.getZ());
    }

    public static IVector[] generateRandomVectors(int N) {
        Vector3D[] vectors = new Vector3D[N];

        for (int i = 0; i < N; i++) {
            vectors[i] = new Vector3D(Math.random() * 101, Math.random() * 101, Math.random() * 101);
        }
        return vectors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector3D vector3D)) return false;
        return Double.compare(vector3D.x, x) == 0 && Double.compare(vector3D.y, y) == 0 && Double.compare(vector3D.z, z) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "Vector3D{" +
                "x=" + String.format("%.1f", x) +
                ", y=" + String.format("%.1f", y) +
                ", z=" + String.format("%.1f", z) +
                '}';
    }
}
