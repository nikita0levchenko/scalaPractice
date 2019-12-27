name := "untitled"

version := "0.1"

scalaVersion := "2.13.1"

libraryDependencies += "org.scalatest" % "scalatest_2.13" % "3.1.0" % Test

lazy val play = (project in file("play"))
lazy val akka = (project in file("akka"))
lazy val gatling = (project in file("gatling"))