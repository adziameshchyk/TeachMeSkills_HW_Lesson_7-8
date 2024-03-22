package com.tms.inheritance_encapsulation_polymorphism.additional_tasks.task_1.runner;

import com.tms.inheritance_encapsulation_polymorphism.additional_tasks.task_1.models.Vector;
import com.tms.inheritance_encapsulation_polymorphism.mandatory_tasks.task_0.models.IVector;
import com.tms.inheritance_encapsulation_polymorphism.mandatory_tasks.task_0.models.Vector2D;
import com.tms.inheritance_encapsulation_polymorphism.mandatory_tasks.task_0.models.Vector3D;

/**
 * Task:
 *
 * Generalize the previous task and write one Vector class for an arbitrary dimension.
 * To do this, in the vector class you should use an array to store coordinates.
 */

public class Runner {

    public static void main(String[] args) {
        Vector[] randomVectors2D = Vector.generateRandomVectors(2, 2);
        Vector vector1 = randomVectors2D[0];
        System.out.printf("Vector1 : %s\n", vector1.toString());
        Vector vector2 = randomVectors2D[1];
        System.out.printf("Vector2 : %s\n", vector2.toString());
        System.out.printf("Are vector 1 and vector 2 equal? - %s\n", (vector1.equals(vector2) ? "Yes." : "No."));

        System.out.printf("Vector1 length : %.1f\n", vector1.length());
        System.out.printf("Vector2 length : %.1f\n", vector2.length());
        System.out.printf("Dot product of vector1 and vector2: %.1f\n", vector1.dotProduct(vector2));
        System.out.printf("Sum of vector1 and vector2: %s\n", vector1.add(vector2));
        System.out.printf("Difference of vector1 and vector2: %s\n", vector1.sub(vector2));

        System.out.println("-------------------------------------------------------------");

//
        Vector[] randomVectors3D = Vector.generateRandomVectors(2, 3);
        Vector vector3 = randomVectors3D[0];
        System.out.printf("Vector3 : %s\n", vector3.toString());
        Vector vector4 = randomVectors3D[1];
        System.out.printf("Vector4 : %s\n", vector4.toString());
        System.out.printf("Are vector 1 and vector 2 equal? - %s\n", (vector3.equals(vector4) ? "Yes." : "No."));

        System.out.printf("Vector3 length : %.1f\n", vector3.length());
        System.out.printf("Vector4 length : %.1f\n", vector4.length());
        System.out.printf("Dot product of vector3 and vector4: %.1f\n", vector3.dotProduct(vector4));
        System.out.printf("Sum of vector3 and vector4: %s\n", vector3.add(vector4));
        System.out.printf("Difference of vector3 and vector4: %s\n", vector3.sub(vector4));
    }

}
