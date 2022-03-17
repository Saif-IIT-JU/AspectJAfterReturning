package com.saif;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class TrackOperation {
	@Pointcut("execution(* Operation.*(..))")
	public void pc() {}
	
	@AfterReturning(pointcut = "pc()", returning ="res")
	public void advice(Object res)
	{
		System.out.println("Additional concern after returning");
		System.out.println("result is " + res);
	}
}
