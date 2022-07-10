name := "miscellaneous"

version := "0.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.10" % "test"

scalaVersion := "2.13.7"

scalacOptions ++= Seq(
  "-feature",
  "-unchecked",
  "-Ywarn-value-discard",
  "-Ywarn-unused:locals",
  "-deprecation"
)
