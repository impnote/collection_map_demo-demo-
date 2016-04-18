package com.donler;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;

/**
 * Created by yali-04 on 16/4/16.
 */
public class TestGeneric {

    public List<Course> courses;

    public TestGeneric() {
        this.courses = new ArrayList<Course>();

    }


    public void testAdd() {
        Course cr1 = new Course("1", "大学语文");
        courses.add(cr1);
        Course cr2 = new Course("2", "java基础");
        courses.add(cr2);
    }

    public void testForEach() {
        for (Course cr : courses)
            System.out.println("课程:" + cr.id + "," + cr.name);
    }
}
