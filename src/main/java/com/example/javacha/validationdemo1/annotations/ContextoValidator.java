package com.example.javacha.validationdemo1.annotations;

import java.util.Map;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;


public class ContextoValidator implements ConstraintValidator<Contexto, String> {

	@Autowired
	Map<String, String> datos;
	
	@Override
	public void initialize(Contexto paramA) {
	}

	@Override
	public boolean isValid(String phoneNo, ConstraintValidatorContext ctx) {
		if(phoneNo == null){
			return false;
		}
		
		if (datos.containsKey("nombre"))
			return true;
        else 
        	return false;
	}

}