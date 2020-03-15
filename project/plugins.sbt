// https://github.com/lightbend/mima/issues/422
resolvers += sbt.Resolver.bintrayIvyRepo("typesafe", "sbt-plugins")

addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.3")
addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.3.3")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.13")
addSbtPlugin("com.dwijnand" % "sbt-dynver" % "3.0.0")
addSbtPlugin("io.crashbox" % "sbt-gpg" % "0.2.0")

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value

// Scripted plugin needs to declare this as a dependency
libraryDependencies += "jline" % "jline" % "2.11"

// For our bintray publishing
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.4")

// For code formatting
addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.15")

// binary compatibility checks
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.3.0")
