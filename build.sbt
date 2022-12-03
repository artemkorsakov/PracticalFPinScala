ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name             := "PracticalFPinScala",
    idePackagePrefix := Some("com.github.artemkorsakov"),
    libraryDependencies ++= Seq(
      compilerPlugin("org.typelevel" %% "kind-projector" % "0.13.2" cross CrossVersion.full),
      "org.typelevel" %% "cats-core"             % "2.9.0",
      "org.typelevel" %% "cats-effect"           % "3.5-639ac01",
      "org.typelevel" %% "cats-mtl"              % "1.3.0",
      "co.fs2"        %% "fs2-core"              % "3.5-1c0be5c",
      "dev.optics"    %% "monocle-core"          % "3.1.0",
      "dev.optics"    %% "monocle-macro"         % "3.1.0",
      "io.estatico"   %% "newtype"               % "0.4.4",
      "eu.timepit"    %% "refined"               % "0.10.1",
      "eu.timepit"    %% "refined-cats"          % "0.10.1",
      "tf.tofu"       %% "derevo-cats"           % "0.13.0",
      "tf.tofu"       %% "derevo-cats-tagless"   % "0.13.0",
      "tf.tofu"       %% "derevo-circe-magnolia" % "0.13.0",
      "tf.tofu"       %% "tofu-core-higher-kind" % "0.11.1"
    ),
    scalacOptions ++= Seq("-Ymacro-annotations", "-Wconf:cat=unused:info")
  )
