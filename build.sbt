
lazy val root = (project in file(".")).
  settings(
    organization := "kamkor",
    version := "1.0.0",
    scalaVersion := "2.11.6",

    name := "scala-seed",

    // Include only src/main/scala in the compile configuration
    unmanagedSourceDirectories in Compile := (scalaSource in Compile).value :: Nil,

    // Include only src/test/scala in the test configuration
    unmanagedSourceDirectories in Test := (scalaSource in Test).value :: Nil,

    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "2.2.4" % Test,
      "org.scalacheck" %% "scalacheck" % "1.12.2" % Test
    ),

    libraryDependencies ++= Seq(
      "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
      "ch.qos.logback" % "logback-classic" % "1.1.2"
    )
  )
