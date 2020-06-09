package cn.xuning.java;

import java.util.HashMap;

/**
 * @author xuning
 * @created 2020-06-09 18:07
 */
public class DebugTest {


    public static void main(String[] args) {

        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("tom1","1");
        stringStringHashMap.put("tom2","1");
        stringStringHashMap.put("tom3","1");
        stringStringHashMap.put("tom4","1");
        stringStringHashMap.put("tom5","1");

        String tom1 = stringStringHashMap.get("tom1");
        System.out.println("tom1 = " + tom1);

    }
}
