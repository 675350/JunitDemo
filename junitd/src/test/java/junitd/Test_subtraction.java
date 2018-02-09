package junitd;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

import org.junit.Test;

public class Test_subtraction {

	
	@Test
	public void test1() {
	Sub obj = new Sub(9,8);
	Assert.assertEquals(1,obj.subtraction());
}
}
