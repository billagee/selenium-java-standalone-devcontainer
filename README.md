# selenium-java-standalone-devcontainer

Demo project that launches a VS Code dev container using the `selenium/standalone-chromium` image.

This provides:

* An OpenJDK environment you can use to test Selenium WebDriver code
* A standalone Selenium Grid for your tests to target

After opening this project in VS Code, and launching the dev container when prompted, run or debug with:

* Open `HelloSelenium.java` in the IDE
* Run with the `Current File` or `HelloSelenium` launch configs

The grid server's VNC port will be mapped to your host at `localhost:5900`, so you can point a VNC client at the grid container and watch tests execute.
