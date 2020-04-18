This is a proof-of-concept to show that Minecraft can execute Python code.

The only new code I've added to the sample is this bit:
```java
Context polyglot = Context.create();
Value array = polyglot.eval("python", "[1,2,42,4]");
int result = array.getArrayElement(2).asInt();
System.out.println(result);
getLogger().info("POLYGLOT "+result);
```

This is just a single array from Python, not an entire plugin, but it proves it works.

## Setup

1. Download and unzip GraalVM: https://github.com/graalvm/graalvm-ce-builds/releases

2. Install Python for GrallVM:

    `~/Downloads/graalvm-ce-java8-20.0.0/Contents/Home/bin/gu install python`

3. Download PaperMC minecraft server (fork of Spigot): https://papermc.io/downloads

4. Check that you can run PaperMC using GraalVM

    `~/Downloads/graalvm-ce-java8-20.0.0/Contents/Home/bin/java -jar paper-*.jar`

5. Compile the sample plugin:

    `./gradlew jar`

6. Copy the generated plugin jar into the plugins folder of PaperMC and re-run paperMC.

    `cp build/libs/*.jar ~/papermc/plugins/`