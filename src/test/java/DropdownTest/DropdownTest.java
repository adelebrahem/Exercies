package DropdownTest;

import TestBasis.Basis;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends Basis {
    @Test
    public void successfulDropdown(){
       var selectOption=homePage.clickDropdown();
       String option="Option 1";
        selectOption.setSelectElement(option);
        var selectedOptions=selectOption.getOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect number of selections");
        assertTrue(selectedOptions.contains(option),"options not selected");
    }
}
