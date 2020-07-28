package com.richmond.webdriverjava.sampleapp.dropdown;

import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.richmond.webdriverjava.sampleapp.BaseTests;
import com.richmond.webdriverjava.sampleapp.pages.DropDownPage;

public class DropDownTests extends BaseTests{
	
	@Test
	public void testSelectOption () {
		DropDownPage dropDownPage = homePage.clickDropDownLink();
		String option = "Option 1";
		dropDownPage.selectFromDropDown(option);
		List <String> selectedOptions = dropDownPage.getSelectedOptions();
		assertEquals("Incorrect number of selections",selectedOptions.size(),1);
		assertTrue("Option 1 not selected",selectedOptions.contains(option));
	}

}
