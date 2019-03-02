package com.lilingyan;

import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;
import java.util.Random;

/**
 * @Author: lilingyan
 * @Date 2019/2/26 11:09
 */
public class MyHashMapTest {

    private static Random random = new Random();

    @Test
    public void putAndRemoveAndGetTest(){
        MyHashMap<Integer,String> myHashMap = new MyHashMap<>();
        HashMap<Integer,String> hashMap = new HashMap<>();
        for (int i = 0; i < 65535; i++) {
            int key = random.nextInt(65535);
            myHashMap.put(key,String.valueOf(key));
            hashMap.put(key,String.valueOf(key));
        }
        Assert.assertTrue(myHashMap.size() == hashMap.size());
        System.out.println(myHashMap.size());
        for (int i = 0; i < 65535/2; i++) {
            int key = random.nextInt(65535);
            if(myHashMap.containsKey(key)){
                Assert.assertTrue(myHashMap.remove(key).equals(hashMap.remove(key)));
            }else{
                Assert.assertTrue(myHashMap.remove(key)==null&&hashMap.remove(key)==null);
            }
        }
        Assert.assertTrue(myHashMap.size() == hashMap.size());
        for (int i = 0; i < 65535; i++) {
            int key = random.nextInt(65535);
            if(myHashMap.get(key) == null){
                Assert.assertTrue(hashMap.get(key) == null);
            }else{
                Assert.assertTrue(myHashMap.get(key).equals(hashMap.get(key)));
            }
        }
    }

}
