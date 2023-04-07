package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapTest1 {

    DashaMap map;

    @Before
    public void Before() {
        map = new DashaMap();
    }

    @Test
    public void name(){
    }

    @Test
    public void setTest(){
        String key = "key";
        String value = "value";
        long expected = 1;

        map.set(key,value);
        long actual = map.bucketSize("k");

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void deleteTest(){
        String key = "key";
        String value = "value";
        long expected = 0;

        map.delete(key);
        long actual = map.bucketSize("k");

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getTest(){
        String key = "Ki";
        String expected = "energy";
        map.set(key, expected);

       String actual = map.get(key);

       Assert.assertEquals(expected, actual);
    }
    @Test
    public void isEmptyTest1(){
        String e = "e";
        String key ="dre";

        map.set(key, e);
        map.isEmpty();

        Assert.assertFalse(map.isEmpty());
    }

    @Test
    public void isEmptyTest2(){
        Assert.assertTrue(map.isEmpty());

    }

    @Test
    public void sizeTest(){
        long expected = 2;

        map.set("unknown", "same same");
        map.set("anything", "same thing");

        long actual = map.size();

        Assert.assertEquals(expected,actual);

    }
}

