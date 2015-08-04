lazy val commonSettings = Seq(
  name := "FPinScalaExercises",
  organization := "com.jjoedouglas",
  version := "0.1.0",
  scalaVersion := "2.11.6"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    libraryDependencies ++= Seq(
      "org.scalatest" % "scalatest_2.11" % "2.2.5" % "test"
    )
  )
