package com.donler;

import java.util.*;

/**
 * Created by yali-04 on 16/4/18.
 */
public class CollectionsTest {
    public void testSort1() {
        List<Integer> integerList = new ArrayList<Integer>();
        Random random = new Random();
        Integer k;
        for (int i = 0; i < 10; i++) {
            do {
                k = random.nextInt(100);

            } while (integerList.contains(k));
            integerList.add(k);
            System.out.println("成功添加整数" + k);

        }
        System.out.println("---------排序前--------");
        for (Integer integer: integerList) {
            System.out.println("元素" + integer);

        }
        Collections.sort(integerList);
        System.out.println("-----------排序后------------");
        for (Integer integer: integerList
             ) {
            System.out.println("元素" + integer);
        }

    }

    public void testSort2() {
        List<String> stringList = new ArrayList<>();
        stringList.add("microsoft");
        stringList.add("google");
        stringList.add("lenovo");
        System.out.println("------排序前-----");
        for (String string : stringList
                ) {
            System.out.println("元素" + string);

        }
        Collections.sort(stringList);
        System.out.println("-------排序后-------");
        for (String string : stringList
                ) {
            System.out.println("元素" + string);
        }

    }


    public void testSort3() {
        List<String> stringList2 = new ArrayList<>();
        Random random = new Random();
        String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i<10; i++) {
            int x = random.nextInt(62);
            sb.append(base.charAt(random.nextInt(x)));
            stringList2.add(sb.toString());
            System.out.println("成功添加"+sb.toString());
        }
        System.out.println("----排序前---");
        for (String string : stringList2
                ) {
            System.out.println("元素:" + string);
        }
        Collections.sort(stringList2);
        System.out.println("-----排序后-----");
        for (String string: stringList2
             ) {
            System.out.println("元素:" + string);

        }
    }
}
