 public static void clickWithNetworkIdle(Locator locator) {
        locator.waitFor(new Locator.WaitForOptions().setState("visible"));
        locator.waitFor(new Locator.WaitForOptions().setState("enabled"));
        locator.page().waitForLoadState(LoadState.NETWORKIDLE);
        locator.click();
    }
 public static void fillWithNetworkIdle(Locator locator, String value) {
        locator.waitFor(new Locator.WaitForOptions().setState("visible"));
        locator.waitFor(new Locator.WaitForOptions().setState("enabled"));
        locator.page().waitForLoadState(LoadState.NETWORKIDLE);
        locator.fill(value);
    }
 public static void selectOptionWithNetworkIdle(Locator locator, String value) {
        locator.waitFor(new Locator.WaitForOptions().setState("visible"));
        locator.waitFor(new Locator.WaitForOptions().setState("enabled"));
        locator.page().waitForLoadState(LoadState.NETWORKIDLE);
        locator.selectOption(value);
    }
 public static void clickWithNetworkIdle(Page page, String text) {
        Locator textLocator = page.getByText(text);
        textLocator.waitFor(new Locator.WaitForOptions().setState("visible"));
        textLocator.waitFor(new Locator.WaitForOptions().setState("enabled"));
        page.waitForLoadState(LoadState.NETWORKIDLE);
        textLocator.click();
    }

////td[span[contains(text(), 'ABC Supply Co. Inc')]]/ancestor::tr[1]/preceding-sibling::*[1]//li//a[starts-with(@id, 'TASK_CONSOLE_FORM')]

