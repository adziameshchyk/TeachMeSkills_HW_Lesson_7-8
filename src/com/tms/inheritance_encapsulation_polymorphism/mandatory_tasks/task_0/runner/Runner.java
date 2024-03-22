package com.tms.inheritance_encapsulation_polymorphism.mandatory_tasks.task_0.runner;

import com.tms.inheritance_encapsulation_polymorphism.mandatory_tasks.task_0.models.IVector;
import com.tms.inheritance_encapsulation_polymorphism.mandatory_tasks.task_0.models.Vector2D;
import com.tms.inheritance_encapsulation_polymorphism.mandatory_tasks.task_0.models.Vector3D;

/**
 * Task:
 *
 * Create a class that describes a vector in a two-dimensional coordinate system.
 * Create a class that describes a vector in a 3D coordinate system.
 * Each class must have:
 *      -a constructor with parameters in the form of a list of coordinates (for example, x, y, z);
 *      -method that calculates the length of a vector. The root can be calculated using Math.sqrt();
 *      -method that calculates the scalar product;
 *      -vector addition method;
 *      -vector difference method;
 *      -a static method that takes an integer N, and returns an array of random vectors of size N.
 * Provide comparison of vectors using the "equals()" method.
 * Display information about a vector using the toString method.
 */

public class Runner {

        public static void main(String[] args) {
                IVector[] randomVectors2D = Vector2D.generateRandomVectors(2);
                IVector vector1 = randomVectors2D[0];
                System.out.printf("Vector1 : %s\n", vector1.toString());
                IVector vector2 = randomVectors2D[1];
                System.out.printf("Vector2 : %s\n", vector2.toString());
                System.out.printf("Are vector 1 and vector 2 equal? - %s\n", (vector1.equals(vector2) ? "Yes." : "No."));

                System.out.printf("Vector1 length : %.1f\n", vector1.length());
                System.out.printf("Vector2 length : %.1f\n", vector2.length());
                System.out.printf("Dot product of vector1 and vector2: %.1f\n", vector1.dotProduct(vector2));
                System.out.printf("Sum of vector1 and vector2: %s\n", vector1.add(vector2));
                System.out.printf("Difference of vector1 and vector2: %s\n", vector1.sub(vector2));

                System.out.println("-------------------------------------------------------------");

//
                IVector[] randomVectors3D = Vector3D.generateRandomVectors(2);
                IVector vector3 = randomVectors3D[0];
                System.out.printf("Vector3 : %s\n", vector3.toString());
                IVector vector4 = randomVectors3D[1];
                System.out.printf("Vector4 : %s\n", vector4.toString());
                System.out.printf("Are vector 1 and vector 2 equal? - %s\n", (vector3.equals(vector4) ? "Yes." : "No."));

                System.out.printf("Vector3 length : %.1f\n", vector3.length());
                System.out.printf("Vector4 length : %.1f\n", vector4.length());
                System.out.printf("Dot product of vector3 and vector4: %.1f\n", vector3.dotProduct(vector4));
                System.out.printf("Sum of vector3 and vector4: %s\n", vector3.add(vector4));
                System.out.printf("Difference of vector3 and vector4: %s\n", vector3.sub(vector4));
        }

}
