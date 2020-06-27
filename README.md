# Clojure AOT via Java Compiler Annotation Processor


Create a package-info.java file corresponding with each namespace that should be compiled:

```
@Aot
package markdingram.sample;

import com.github.markdingram.aot.Aot;
```


Assuming all the necessary Clojure sources are on the classpath then the AOT processor will call Clojure's 'core.compile' outputting into the target/classes directory direct from the Java compilation.


Why bother? All will be revealed in a later post. Stay tuned!


Instructions:

````
$ mvn clean package
$ java -jar sample/target/sample-1.0-SNAPSHOT.jar markdingram.sample
Hello AOT!
````
