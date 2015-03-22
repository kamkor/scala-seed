
lazy val commonSettings = Seq(
  organization := "kamkor",
  version := "1.0.0",
  scalaVersion := "2.11.6"
)

lazy val scalatest = "org.scalatest" %% "scalatest" % "2.2.4"

lazy val scalacheck = "org.scalacheck" %% "scalacheck" % "1.12.2"

lazy val root = (project in file(".")).  
  settings(
    commonSettings,
  
    name := "scala-seed",
    
    // Include only src/main/scala in the compile configuration
    unmanagedSourceDirectories in Compile := (scalaSource in Compile).value :: Nil,
    
    // Include only src/test/scala in the test configuration
    unmanagedSourceDirectories in Test := (scalaSource in Test).value :: Nil,

    libraryDependencies ++= Seq(
      scalatest % "test",
      scalacheck % "test"
    ),

    libraryDependencies ++= Seq(
      "ch.qos.logback" % "logback-classic" % "1.1.2"
    )
  )
