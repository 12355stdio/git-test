package com.xmut.git;/*
 * @Author chenL
 * @Date 2022/6/12 15:55
 * @PackageName:com.xmut.git
 * @ClassName: TodayGit
 * @Description:
 * @Version 1.0
 * */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TodayGit {
    public static void main(String[] args) {

        System.out.println("2022 06 12 hello git ");

        System.out.println("2022 06 12 hello git2 ");
        System.out.println("2022 06 12 hello git3 ");
        System.out.println("2022 06 12 hello git4 ");
        System.out.println("master test!!! ");

        System.out.println("hot-fix test!!! ");

        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(456789);
        collection.add(new String("hello world"));
        collection.add(new Person("小王",21));

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
