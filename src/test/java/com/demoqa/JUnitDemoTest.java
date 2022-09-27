package com.demoqa;

import org.junit.jupiter.api.*;

public class JUnitDemoTest {
    @BeforeAll
    static void  setUp() {
        System.out.println("### @BeforAll !");
    }
    @AfterAll
    static void  tearDown() {
        System.out.println("### @AfterAll !");
    }
    @BeforeEach
        void beforeEachTest(){
        System.out.println("### @BeforeEach !");
    }
    @AfterEach
    void AfterEachTest(){
        System.out.println("### @AfterEach !");
    }
    @Test
    void simpleTestFirst() {
        System.out.println("###   @Test simpleTestFirst !");
        Assertions.assertTrue(3>2);
    }
    @Test
    void simpleTestSecond() {
        System.out.println("###   @Test simpleTestSecond !");
        Assertions.assertTrue(3>2);
    }
}
