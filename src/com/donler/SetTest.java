package com.donler;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by yali-04 on 16/4/16.
 */
public class SetTest {
    public List<Course> coursesToSelect;

    public SetTest() {
        coursesToSelect = new ArrayList<Course>();
    }

    public void testAdd() {
        //创建一个课程对象,并通过调用add方法,添加到备选课程List中
        Course cr1 = new Course("1", "数据结构");
        coursesToSelect.add(cr1);

//        Course temp = (Course) coursesToSelect.get(0);
//        System.out.println("添加了课程" + temp.id + ":" + temp.name);

        Course cr2 = new Course("2", "C语言");
        coursesToSelect.add(0, cr2);
//        Course temp2 = (Course) coursesToSelect.get(0);
//        System.out.println("添加了课程" + temp2.id + ":" + temp2.name);

        Course[] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
        coursesToSelect.addAll(Arrays.asList(course));
//        Course temp3 = (Course) coursesToSelect.get(2);
//        Course temp4 = (Course) coursesToSelect.get(3);
//        System.out.println("添加了两门课程" + temp3.id + ":" + temp3.name + ";" + temp4.id + ":" + temp4.name);
        Course[] course2 = {new Course("5", "高等数学"), new Course("6", "大学英语")};
        coursesToSelect.addAll(Arrays.asList(course2));
//        Course temp5 = (Course) coursesToSelect.get(4);
//        Course temp6 = (Course) coursesToSelect.get(5);
//        System.out.println("添加了两门课程" + temp5.id + ":" + temp5.name + ";" + temp6.id + ":" + temp6.name);

    }

    public void testForEach() {


        for (Course cr : coursesToSelect)
            System.out.println("课程:" + cr.id + "," + cr.name);

    }

    public void testForEachStudentCr(Student student) {
        for (Course cr : student.Courses) {
            System.out.println("课程:" + cr.id + ":" + cr.name);
        }
    }


    public  void testListContains() {
//        Course course = coursesToSelect.get(0);
//        System.out.println("取得课程" + course.name);
//        System.out.println("备选课程中是否包含课程:" + course.name + "," + coursesToSelect.contains(course));
//        Course course2 = new Course(course.id,course.name);
        System.out.println("请输入课程名字:");
        Scanner conlose = new Scanner(System.in);
        String name = conlose.next();
        Course course = new Course();
        course.name = name;
        System.out.println("课程中是否包含该课程:" + course.name + "," + coursesToSelect.contains(course));

        }


    }



