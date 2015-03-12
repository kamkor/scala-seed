# scala-seed
My single-module scala seed project. I clone it whenever I want to start writing something new in Scala.

* Only Scala source folders, because I usually don't use Java in my Scala projects.
* [Sbteclipse](https://github.com/typesafehub/sbteclipse/) sbt plugin. Use "eclipse" command to generate or update eclipse project files. Use "eclipse with-source=true" command to also fetch sources for dependencies.
* [Scalastyle](http://www.scalastyle.org/) sbt plugin. Use "scalastyle" command. 
* [ScalaTest](http://www.scalatest.org/) and [ScalaCheck](http://scalacheck.org/) dependencies for tests.
* [Logback](http://logback.qos.ch/) dependency with basic configuration - Logs to file with RollingFileAppender and to Stdout with ConsoleApender.
