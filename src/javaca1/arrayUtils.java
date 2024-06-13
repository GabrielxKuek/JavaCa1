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
    
    // remove element by index
    public static <T> T[] removeElementByIndex(T[] array, int indexToRemove) {
        if (array == null || indexToRemove < 0 || indexToRemove >= array.length) {
            return array;
        }

        T[] newArray = (T[]) new Object[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indexToRemove) {
                newArray[j++] = array[i];
            }
        }

        return newArray;
    }
    
    // append element into array
//    public static <T> T[] appendElement(T[] array, T element) {
//        // Create a new array of the same type with increased length
//        @SuppressWarnings("unchecked")
//        T[] newArray = (T[]) new Object[array.length + 1];
//        
//        // Copy elements from the original array to the new array
//        for (int i = 0; i < array.length; i++) {
//            newArray[i] = array[i];
//        }
//        
//        // Add the new element to the end of the new array
//        newArray[array.length] = element;
//        
//        // Return the new array
//        return newArray;
//    }
}
