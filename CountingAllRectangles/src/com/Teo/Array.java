package com.Teo;

public class Array {

    /**
     * Searches for the point in the matrix
     * @param array
     * @param key
     * @return
     */

    public static boolean contains(String []array, String key) {
        for(String element : array) {
            if(element.equals(key))
                return true;
        }
        return false;
    }

    /**
     * Overloaded method that takes as parameters objects
     * @param array
     * @param key
     * @return
     */

    public static boolean contains(Object []array, Object key) {
        return contains(objectToStringArray(array), key.toString());
    }

    /**
     * Converts an Object to String Array
     * @param array
     * @return
     */

    public static String[] objectToStringArray(Object []array) {
        String []tempArray = new String[array.length];
        for(int i = 0; i < array.length; i++) {
            tempArray[i] = (array[i]).toString();
        }
        return tempArray;
    }
    }
