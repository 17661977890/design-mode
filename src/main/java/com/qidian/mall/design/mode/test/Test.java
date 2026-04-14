package com.qidian.mall.design.mode.test;

import org.springframework.util.StringUtils;

import java.util.*;

public class Test {

    private static volatile boolean flag = false;
    private static final Object lock = new Object();

    public static void main(String[] args) {
//        int[] inputNos = {5,6,7};
////        randomNum(inputNos);
//        List<String> re = s(inputNos);
//        System.out.println(Arrays.toString(re.toArray()));
//        System.out.println(re.size());



        Test test =new Test();
        Thread A = new Thread(test.new AAA());
        Thread B = new Thread(test.new BBB());
        A.start();
        B.start();
    }


    // "23"
    public static List<String> s(int[] input){
        List<String> result = new ArrayList<>();
        if(StringUtils.isEmpty(input)){
            return result;
        }else {
            result.add("");
        }
        String[] m = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for (int i = 0; i < input.length; i++) {
            List<String> res = new ArrayList<>();
            String l = m[input[i]];
            for (int j = 0; j <result.size() ; j++) {
                for (int k = 0; k < l.length(); k++) {
                    res.add(result.get(j)+l.charAt(k));
                }
            }
            result=res;
        }

        return result;
    }




    class AAA implements Runnable{

        @Override
        public void run() {
//            String[] s ={"12345","678910","1112131415","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

            for (int i = 0; i <1000 ; i++) {
                synchronized (lock){
                    while (flag){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if(i!=0 && (i)%5!=0){
                        System.out.print(i);
                        continue;
                    }
                    if(i!=0){
                        System.out.print(i);
                        System.out.println("");
                    }
                    if(i==0){
                        flag=false;
                        continue;
                    }
                    flag=true;
                    lock.notifyAll();
                }

            }
        }

    }

    // 线程A 打印12345 线程B 打印字母A
// 线程A 打印678910 线程B 打印字母B ....Z
    class BBB implements Runnable{


        @Override
        public void run() {

            String[] s ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

            for (int i = 0; i <s.length ; i++) {
                synchronized (lock){
                    while (!flag){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(s[i]);
                    if("z".equals(s[i])){
                        flag=true;
                        continue;
                    }
                    flag=false;
                    lock.notifyAll();

                }

            }
        }

    }
}




