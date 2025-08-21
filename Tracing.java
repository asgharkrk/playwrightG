// Locate the combobox by its role and accessible name, then click to open
Locator stateDropdown = page.getByRole(AriaRole.COMBOBOX, new Page.GetByRoleOptions().setName("State/Province"));
stateDropdown.click();
// Directly locate and click the associated control via its label text
page.getByLabel("State/Province").click();

===============================================
// First, narrow down the section by role and accessible name
Locator section = page.getByRole(AriaRole.COMBOBOX, 
                    new Page.GetByRoleOptions().setName("State/Province"));

// Now click the label that has the text "select state/province-"
section.getByText("select state/province-").click();
===============================================

// First, locate the entire section by its wrapper <span>
Locator section = page.locator("span.ui-float-label.ui-float-label2");

// Ensure the section has the label with text "State/Province"
Locator stateLabel = section.locator("label").filter(new Locator.FilterOptions().setHasText("State/Province"));

// Now, inside that same section, locate the label with text "select state/province-" and click it
section.locator("label").filter(new Locator.FilterOptions().setHasText("select state/province-")).click();

===============================================================================================================

// Find the label, go to its sibling combobox, then click the trigger
Locator stateLabel = page.getByText("State/Province", new Page.GetByTextOptions().setExact(true));
Locator combobox = stateLabel.locator("xpath=preceding-sibling::div[contains(@class, 'ui-selectonemenu')]");
combobox.locator(".ui-selectonemenu-trigger").click();


// Similar to your original, but target the trigger for opening
Locator section = page.locator("span.ui-float-label.ui-float-label2");
Locator stateLabel = section.getByText("State/Province", new Locator.GetByTextOptions().setExact(true));
Locator combobox = stateLabel.locator("xpath=preceding-sibling::div[contains(@class, 'ui-selectonemenu')]");
combobox.locator(".ui-selectonemenu-trigger").click();

