package com.donler;

import com.sun.xml.internal.bind.v2.model.core.ID;
import sun.util.PreHashedMap;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

/**
 * Created by yali-04 on 16/4/16.
 */
public class MapTest {
    public Map<String, Student> students;

    public MapTest() {
        this.students = new HashMap<String,Student>();

    }

    public void testPut() {
        Scanner console = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("请输入学生ID");
            String ID = console.next();
            Student st = students.get(ID);
            if (st == null) {
                System.out.println("请输入学生姓名");
                String name = console.next();
                Student newStudent = new Student(ID, name);
                students.put(ID, newStudent);
                System.out.println("成功添加学生" + students.get(ID).name);
                i++;

            }else {
                System.out.println("该学生已经被占用!");
                continue;
            }
        }

    }

    public void testKeySet() {
        Set<String> keyset = students.keySet();
        System.out.println("总共有" + students.size() + "个学生");



        for (String stuId : keyset
                ) {
            Student st = students.get(stuId);
            if (st != null) {
                System.out.println("学生:" + st.name);

            }
        }
    }

    public void testRemove() {
        Scanner console = new Scanner(System.in);
        while (true) {
            System.out.println("请输入删除的学生ID");
            String ID = console.next();
            Student st = students.get(ID);
            if (st == null) {
                System.out.println("该ID不存在");
                continue;

            }
            students.remove(ID);
            System.out.println("成功删除学生" + st.name);
            break;


        }
    }

    public void testEntrySet() {
        Set<Map.Entry<String, Student>> entrySet = students.entrySet();
        for (Map.Entry<String, Student> entry : entrySet
                ) {
            System.out.println("取得建" + entry.getValue().id);

        }
    }

    public void testModify() {
        System.out.println("请输入要修改的学生的ID:");
        Scanner console = new Scanner(System.in);
        while (true) {
            String ID = console.next();
            Student student = students.get(ID);
            if (student == null) {
                System.out.println("该学生不存在");
                continue;
            }
            System.out.println("当前该学生ID,所对应的学生为:" + student.name);
            System.out.println("请输入新的学生姓名:");
            String name = console.next();
            Student newStudent = new Student(ID, name);
            students.put(ID, newStudent);
            System.out.println("修改成功");
            break;
        }

    }

}
