# rcp.demo with JavaFx
A RCP Demo Project with Java Version, JavaFX and, OSGI



## Quickstart
Download JavaFX 11 and set to following path

```
export JAVAFX_PATH=/path/of/javafx/lib/
```

Running on Windows and Linux environment or Mac (at least):

```
mvn clean install -Dorg.osgi.framework.bundle.parent=ext -Dosgi.framework.extensions=org.eclipse.fx.osgi

```

The rcp.demo.product/target folder will contain then all three distributions:

 - Windows 64bit
 - Linux (Gtk) 64Bit
 - Mac OSX 64Bit

![image](https://github.com/hgvanpariya/e4withjavafx/assets/1458819/c44ea8b7-42ce-4902-b908-48777b1d791b)



**Please note**: Requires Java 8 to run this.


## Links

 - https://www.vogella.com/tutorials/EclipseRCP/article.html
 - https://www.vogella.com/tutorials/EclipseTycho/article.html
 - https://hub.docker.com/r/adoptopenjdk/openjdk11-openj9
