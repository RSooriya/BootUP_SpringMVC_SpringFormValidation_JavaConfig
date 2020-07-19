package com.sooriya.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberConstraintValidator implements ConstraintValidator<PhoneNumber,String> {

	@Override
	public boolean isValid(String theNumber, ConstraintValidatorContext context) {
		
		if(theNumber!=null)
		{
			if(theNumber.length()==10 && theNumber.startsWith("9"))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return true;
		}
		
	}

	
}
