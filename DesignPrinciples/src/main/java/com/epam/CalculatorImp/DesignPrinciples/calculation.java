package com.epam.CalculatorImp.DesignPrinciples;
import javax.script.*;
public class calculation
{
	public Object calculate(String s)throws ScriptException
	{
  ScriptEngineManager mgr=new ScriptEngineManager();
  ScriptEngine engine=mgr.getEngineByName("JavaScript");
  return engine.eval(s);
	}
}
