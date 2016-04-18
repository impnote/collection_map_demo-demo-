package com.donler;


import java.security.PublicKey;
import java.util.*;

/**
 * 备选课程
 * Created by yali-04 on 16/4/15.
 */


public class ListTest {

    public List coursesToSelect;

    public ListTest() {
        this.coursesToSelect = new ArrayList();

    }


    public void testAdd() {
        //创建一个课程对象,并通过调用add方法,添加到备选课程List中
        Course cr1 = new Course("1", "数据结构");
        coursesToSelect.add(cr1);
        Course temp = (Course) coursesToSelect.get(0);
        System.out.println("添加了课程" + temp.id + ":" + temp.name);

        Course cr2 = new Course("2", "C语言");
        coursesToSelect.add(0,cr2);
        Course temp2 = (Course) coursesToSelect.get(0);
        System.out.println("添加了课程" + temp2.id + ":" + temp2.name);

        Course[] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
        coursesToSelect.addAll(Arrays.asList(course));
        Course temp3 = (Course) coursesToSelect.get(2);
        Course temp4 = (Course) coursesToSelect.get(3);
        System.out.println("添加了两门课程" + temp3.id + ":" + temp3.name + ";" + temp4.id + ":" + temp4.name);
        Course[] course2 = {new Course("5", "高等数学"), new Course("6", "大学英语")};
        coursesToSelect.addAll(Arrays.asList(course2));
        Course temp5 = (Course) coursesToSelect.get(4);
        Course temp6 = (Course) coursesToSelect.get(5);
        System.out.println("添加了两门课程" + temp5.id + ":" + temp5.name + ";" + temp6.id + ":" + temp6.name);
    }


    public void testGet() {
        int size = coursesToSelect.size();
        System.out.println("有如下课程待选:");
        for (int i = 0; i < size ; i++ ) {
            Course cr = (Course) coursesToSelect.get(i);
            System.out.println("课程:"+cr.id+":"+cr.name);

        }
    }

    public void testtype() {
        System.out.println("测试是否能够添加其他数据类型");
        coursesToSelect.add("字符串");
    }


    public static void main(String[] args) {
//        ListTest lt = new ListTest();
//        lt.testAdd();
//        lt.testGet();
//        lt.testtype();
//        TestGeneric tg = new TestGeneric();
//        tg.testAdd();
//        tg.testForEach();
//        SetTest st = new SetTest();
//        st.testAdd();
//        st.testForEach();
//        Student student = new Student("1", "xiaoqiang");
//        System.out.println("欢迎:" + student.name + "同学选课!");
//        Scanner console = new Scanner(System.in);
//        for (int i = 3; i < 3; i++) {
//            System.out.println("请输入课程ID");
//            String courseId = console.next();
//                if (cr.id.equals(courseId)) {
//                    student.Courses.add(cr);
//                }
//
//            }

//        }
//        st.testForEachStudentCr(student);
//        MapTest mt = new MapTest();
//        mt.testPut();
//        mt.testKeySet();

//        MapTest mt = new MapTest();
//        mt.testPut();
//        mt.testKeySet();
//        mt.testModify();
//        mt.testKeySet();
//
////        mt.testRemove();
//        mt.testEntrySet();
//        SetTest st = new SetTest();
//        st.testAdd();
//        st.testListContains();
//        CollectionsTest ct = new CollectionsTest();
//        ct.testSort1();
//        CollectionsTest ct2 = new CollectionsTest();
//        ct2.testSort2();
        CollectionsTest ct3 = new CollectionsTest();
        ct3.testSort3();
   }
}


