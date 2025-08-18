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



import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;


        page.locator(".ui-selectonemenu")
                   .filter(new Locator.FilterOptions().setHas(
                       page.getByLabel("State - City *")
                   ))
                   .filter(new Locator.FilterOptions().setHas(
                       page.locator(".ui-selectonemenu-label").getByText("IA- Davenport")
                   ));
    }

.ui-selectonemenu >> has=label:has-text("State - City *") >> has=.ui-selectonemenu-label:has-text("IA- Davenport")
