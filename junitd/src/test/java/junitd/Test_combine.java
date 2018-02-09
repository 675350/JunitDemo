package junitd;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Test;

import junit.framework.Assert;
public class Test_combine {

	
	@Test
	public void unit_test(){
		Sub s2 = new Sub("Hb","d");
		Assert.assertEquals("Hbd",s2.combine());
}

}
