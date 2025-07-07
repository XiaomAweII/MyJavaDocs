//package com.tuling.jucdemo.threadlocal;
//
///**
// * 选择jdk21（preview）
// */
//public class ScopedValueTest {
//
//    public static ScopedValue<String> NAME = ScopedValue.newInstance();
//
//    public static void main(String[] args) {
//        ScopedValue.runWhere(NAME,"fox",ScopedValueTest::a);
//    }
//
//    public static void a(){
//        System.out.println("a:" + NAME.get());
//    }
//
//    public static void b(){
//        System.out.println("b:" + NAME.get());
//    }
//
//}
