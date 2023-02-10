package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {
    public static void main(String[] args){
              RWOnly obj=new RWOnly();
              obj.setName("Minal");
              System.out.println(obj.getName());
    }
    
}
