/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaca1;

/**
 *
 * @author Gabriel Kuek
 */
public class arrayUtils {
    public static Student[] removeElementByIndex(Student[] array, int indexToRemove) {
        if (array == null || indexToRemove < 0 || indexToRemove >= array.length) {
            return array;
        }
        
        Student[] newArray = new Student[array.length - 1];
        
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indexToRemove) {
                newArray[j++] = array[i];
            }
        }
        
        return newArray;
    }
}
