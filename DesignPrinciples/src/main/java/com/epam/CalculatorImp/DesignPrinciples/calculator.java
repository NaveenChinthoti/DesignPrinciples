package com.epam.CalculatorImp.DesignPrinciples;
import java.util.*;

import javax.script.ScriptException;
public class calculator 
{
    public static void main( String[] args ) throws ScriptException
    {
    	Scanner sc=new Scanner(System.in);
    	String equation=sc.next();
    	calculation c=new calculation();
    	System.out.println("Result is "+c.calculate(equation));
    }
}