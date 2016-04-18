package com.donler;

import java.util.Objects;

/**
 * 课程类
 * Created by yali-04 on 16/4/15.
 */
public class Course {

    public String id;

    public String name;

    public Course(){}

    public Course(String id, String name) {

        this.id = id;

        this.name = name;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Course))
            return false;
        Course course = (Course) obj;
        if (this.name == null) {
            if (course.name == null)
                return true;
            else return false;
        } else {
            if (this.name.equals(course.name))
                return true;
            else
                return false;
        }
    }
}
