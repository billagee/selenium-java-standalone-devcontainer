# selenium-java-grid-devcontainer

Demo project that shows how to launch an OpenJDK dev container for VS Code with a Selenium Grid sidecar container.

Useful for debugging Java Selenium tests that are written to execute on a Grid server environment.

After opening this project in VS Code, and launching the dev container when prompted, run or debug with:

* Open `HelloSelenium.java` in the editor and run with the `Current File` launch config

Or, to build and launch a test from the terminal inside the dev container: 

* `mvn test-compile`
* `mvn exec:java -D"exec.mainClass"="dev.selenium.hello.HelloSelenium" -D"exec.classpathScope"=test`

The grid server's VNC port will be mapped to your host at `localhost:5900`, so you can point a VNC client at the grid container and watch tests execute.
# selenium-java-standalone-devcontainer
