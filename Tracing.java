context.tracing().start(new Tracing.StartOptions()
                .setScreenshots(true)  // Capture screenshots
                .setSnapshots(true)    // Capture DOM snapshots
                .setSources(true));    // Include source code

            // Perform test actions
            Page page = context.newPage();
            page.navigate("https://example.com");
            page.click("a[href]");
            System.out.println("Page title: " + page.title());

            // Stop tracing and save to a file
            context.tracing().stop(new Tracing.StopOptions()
                .setPath(java.nio.file.Paths.get("trace.zip")));
