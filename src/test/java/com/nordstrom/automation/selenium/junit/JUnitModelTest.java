package com.nordstrom.automation.selenium.junit;

import org.junit.Test;
import com.nordstrom.automation.selenium.annotations.InitialPage;
import com.nordstrom.automation.selenium.core.ModelTestCore;
import com.nordstrom.automation.selenium.model.ExamplePage;
import com.nordstrom.common.file.PathUtils;

@InitialPage(ExamplePage.class)
public class JUnitModelTest extends JUnitBase {

    @Test
    public void testBasicPage() {
        ModelTestCore.testBasicPage(this);
    }
    
    @Test
    public void testParagraphs() {
        ModelTestCore.testParagraphs(this);
    }
    
    @Test
    public void testTable() {
        ModelTestCore.testTable(this);
    }

    @Test
    public void testFrameByElement() {
        ModelTestCore.testFrameByElement(this);
    }

    @Test
    public void testFrameByIndex() {
        ModelTestCore.testFrameByIndex(this);
    }

    @Test
    public void testFrameById() {
        ModelTestCore.testFrameById(this);
    }
    
    @Test
    public void testComponentList() {
        ModelTestCore.testComponentList(this);
    }
    
    @Test
    public void testComponentMap() {
        ModelTestCore.testComponentMap(this);
    }
    
    @Test
    public void testFrameList() {
        ModelTestCore.testFrameList(this);
    }

    @Test
    public void testFrameMap() {
        ModelTestCore.testFrameMap(this);
    }

    /**
     * This test verifies that stale elements are automatically refreshed
     * and that the search context chain gets refreshed efficiently.
     */
    @Test
    public void testRefresh() {
        ModelTestCore.testRefresh(this);
    }

    @Override
    public String getOutputDirectory() {
        return PathUtils.ReportsDirectory.getPathForObject(this).toString();
    }

}
