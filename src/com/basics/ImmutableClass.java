package com.basics;

/*
    To create immutable class in java, you have to do following steps.
    Declare the class as final so it can�t be extended.
    Make all fields private so that direct access is not allowed.
    Don�t provide setter methods for variables
    Make all mutable fields final so that it�s value can be assigned only once.
    Initialize all the fields via a constructor performing deep copy.
    Perform cloning of objects in the getter methods to return a copy 
    rather than returning the actual object reference. 
 */

public final class ImmutableClass 
{ 
    private final String name; 
    private final int regNo; 
  
    public ImmutableClass(String name, int regNo) 
    { 
        this.name = name; 
        this.regNo = regNo; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public int getRegNo() 
    { 
        return regNo; 
    } 
} 