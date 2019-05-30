/* Calculator Backend for the calculator gui
 * 
 * by Goran Topic
 */

import java.util.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class Calculator {
	/* class for calculator */
	
	private ScriptEngineManager manager = new ScriptEngineManager();
	private ScriptEngine engine = manager.getEngineByName("js");
	
	
	private ArrayList<Character> validOp = null;
	private Integer firstInt = null;
	private Integer secondInt = null;
	private Character operation = null;
	
	public Calculator() {
		/* contructor */
		this.validOp = new ArrayList<Character>();
		this.validOp.add('+');
		this.validOp.add('-');
		this.validOp.add('*');
		this.validOp.add('/');
		this.validOp.add('^');
		this.validOp.add('(');
		this.validOp.add(')');
		this.validOp.add(' ');
		
	}

	
	public void getFirstNum(Integer num) {
		/* get first num */
		this.firstInt = num;
	}
	
	public void getSecondNum(Integer num) {
		/* get second num */
		this.secondInt = num;
	}
	
	
	public void getOperand(Character op) {
		/* get operation for nums */
		this.operation = op;
	}
	
	
	public Integer calculate(String txt) throws ScriptException {
		//calculate text
		for(int i = 0; i < txt.length(); i++)
			//if character is not  digit and is not a valid character
			if(!Character.isDigit(txt.charAt(i)) &&
			   !this.validOp.contains(Character.valueOf(txt.charAt(i)))) {
				System.err.println("invalid eval string");
				return -1;
			}
		
		Object result = engine.eval(txt);
		
		
		return (Integer) result;
		
	}
	public Float calc() {
		/* get calculate the answer */
		
		/* check if everything */
		if(this.firstInt == null) {
			System.err.println("Error: First num not set");
			return null;
		}else if(this.secondInt == null) {
			System.err.println("Error: Second num not set");
			return null;
		}else if(this.operation == null) {
			System.err.println("Error: Operand not set");
			return null;
		}else if(!validOp.contains(operation)){
			System.err.println("Error: unknown operation");
			return null;
		}
		
		//do operation 
		switch (operation) {
			case '+':
				return (float) firstInt + secondInt;
			case '-':
				return  (float) firstInt - secondInt;
			case '*':
				return (float) firstInt * secondInt;
			case '/': 
				return (float) firstInt / secondInt;
			default:
				System.err.println("Error: unknown operation");
				return null;
				
		}
		
	}
}
