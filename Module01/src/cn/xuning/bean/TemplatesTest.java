package cn.xuning.bean;

import cn.xuning.java.HelloWorld;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author xuning
 * @create 2020-06-09 10:00
 */
public class TemplatesTest {
    //模板六：psf prsf psfi psfs
    public static final String name = null;
    private static final int i = 0;
    private static final Customer c = new Customer();
    private static final HelloWorld h = null;
    public static final int r = 0;
    public static final String s = "";



    public static void main(String[] args) {
        //模板一：main方法 psvm
        //模板二：sout  soutp soutm soutv xxx.out
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("TemplatesTest.main");
        int num1= 1;
        System.out.println("num1 = " + num1);
        //模板三：fori iter itar
        String[] strings = {"1", "2", "3"};
        String[] arr = new String[]{"2","4"};
        for (int i = 0; i < strings.length; i++) {

        }
        for (String string : strings) {

        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }
        //模板四；list.for list.fori list.forr
        ArrayList list = new ArrayList();
        for (Object o : list) {

        }
        for (int i = 0; i < list.size(); i++) {

        }
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        //模板五：ifn inn xxx.nn xxx.null
        if (list == null) {

        }
        if (list != null) {

        }
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
