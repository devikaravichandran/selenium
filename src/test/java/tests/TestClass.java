package tests;


import org.testng.annotations.Test;

import Base.BaseClass;

public class TestClass extends BaseClass {

	@Test
	public void OpenApplication() {
		getDriver();
		driver.get("https://www.google.com/");
	}

	}

