package com.example.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Calculator {

    @RequestMapping("/c1")
    @ResponseBody
//    public Model calculate
    public String calculate( String a,Character b,String c){
        System.out.println("hahaha");
        int num1 = Integer.parseInt(a);
        char oper = b;
        int num2 = Integer.parseInt(c);

        int result = 0;
        switch(oper){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                try{
                    if(num2 != 0){
                        result = num1/num2;
                    }else{
                        throw new RuntimeException("除法运算，分母不能为0！");
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
                break;
        }
        System.out.println(result);
        return Integer.toString(result);
    }
}

