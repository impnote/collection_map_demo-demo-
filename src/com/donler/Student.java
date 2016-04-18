package com.donler;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by yali-04 on 16/4/15.
 */
public class Student {

    public String id;

    public String name;

    public Set <Course> Courses;

    public Student(String id, String name) {

        this.id = id;

        this.name = name;

        this.Courses = new HashSet<Course>();


    }
}
