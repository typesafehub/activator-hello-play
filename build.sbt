name := "hello-play"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  // Play modules we want to use
  jdbc,
  anorm,
  cache,
  ws,
  // WebJars pull in client-side web libraries
  "org.webjars" %% "webjars-play" % "2.3.0-RC1-1",
  "org.webjars" % "bootstrap" % "2.3.1"
  // Add your own project dependencies in the form:
  // "group" % "artifact" % "version"
)

