import Publish._

libraryDependencies ++= Seq(
  "org.typelevel" % "cats-core_2.12" % "2.0.0-RC1",
  "com.fasterxml" % "aalto-xml" % "1.2.1",
  "org.scalactic" %% "scalactic" % "3.0.5" % "test",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "org.manatki" % "derevo-core_2.12" % "0.10.1",
)

publishName := "derevo"

sources in (Compile, doc) := Seq.empty