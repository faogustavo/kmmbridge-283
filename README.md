# Reproducer for issue 283 from KMMBridge

This is an issue happening on the integration of KMMBridge with Skie.
When Skie generates new swift code, the XCode fails to compile the project.

## Steps to reproduce

1. In the `Greeting.kt` file, ensure that the suspend and flow methods are commented
2. Assemble the framework using `./gradlew spmDevBuild`
3. Open the iOS Project on XCode
4. Compile the project
5. Everything works
6. Return to the `Greeting.kt`, and uncomment the two methods
7. Run the gradle task to compile the framework again
8. In the `ContentView.swift`, uncomment the code using those two new functions
9. Attempt to build again and receive an error

The only way to make the project return to compile is when you stop the current running build on XCode and clean the project.

A video demonstrating the issue is available on the Github issue - https://github.com/touchlab/KMMBridge/issues/283.

---

Notes:
1. Removing SKIE and using the framework directly from OBJC headers works fine.
   1. Please remember that removing Skie, the flow sample will not work;
   2. But the suspend sample works fine using try await in the current release of kotlin;
