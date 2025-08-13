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

//span[text()='ABC Supply Co. Inc' and @class='font-italic text-grey font-weight-bold small']/ancestor::td[1]//a[@id='TASK_COLSOLE_FORM:varcustomerRequestsid:3:review_credit_app_cmd']
//span[text()='ABC Supply Co. Inc' and @class='font-italic text-grey font-weight-bold small']/ancestor::td[1]//a[contains(@onclick, 'PrimeFaces.ab') and contains(., 'REQPJ')]

