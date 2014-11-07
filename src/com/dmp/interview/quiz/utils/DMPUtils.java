/*
 * $Id$
 * 
 * Copyright (c) Digital Monitoring Products Inc. 2014.
 * All rights reserved.
 */
package com.dmp.interview.quiz.utils;

/**
 * A set of utilities developed by candidates seeking a Java programming
 * position with Digital Monitoring Products, Inc.
 *
 * @author jdaehn
 */
public class DMPUtils {

    /**
     * Convert the given character array into an integer value, when possible.
     *
     * It is assumed that the given character array is representative of a
     * C-style string, i.e., that it is terminated with the null character 0x0.
     *
     * @param stringInput a C-style character array representing an integer
     * @return the corresponding integer value of the given input. If the given
     * input is not terminated by the null character, return
     * <tt>Integer.MIN_VALUE</tt>. If the given input does not represent an
     * integer value, return -1.
     */
    public static int convertToInt(char[] stringInput) {
        // the value to be returned (with an arbitrary initialization; change 
        // initial value accordingly if you feel it's necessary)
        int value = 0;

        // Remove this comment and fill in your work here...
        return value;
    }

    /**
     * Tests the bit at {@code position} of the given {@code value}.
     *
     * <ol>
     * <li>It is assumed that the least significant bit is located at bit
     * position 0.</li>
     * <li>NOTE: You are not allowed to use any String functions.</li>
     * </ol>
     *
     * @param value the interrogated value
     * @param position the bit-position of the given value of interest
     * @return true if the bit at the requested position is set (i.e., is value
     * 1), false otherwise
     */
    public static boolean testBit(int value, int position) {
        // the value to be returned with pessimistic initialization
        boolean isSet = false;

        // create a mask to determine if the given bit is set
        int mask = 1 >> position;
        
        // determine if interrogated bit is set and...
        isSet = ((value | mask) != 0);
        
        // return our results
        return isSet;
    }
}
