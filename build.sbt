scalaVersion := scalaV.v213

lazy val codegen = (project in (file("") / "codegen"))
  .enablePlugins(SbtTwirl)
  .settings(scalaVersion := scalaV.v213, libraryDependencies ++= libScalax.`os-lib`.value, scalafmtOnCompile := true)

lazy val adt = crossProject(JSPlatform, JVMPlatform)
  .crossType(CrossType.Pure)
  .in(file("") / "adt")
  .settings(
    scalaVersion       := scalaV.v213,
    crossScalaVersions := Seq(scalaV.v212, scalaV.v213, scalaV.v3),
    scalafmtOnCompile  := true,
    publishTo          := localStaging.value,
    name               := "simple-adt",
    libraryDependencies ++= libScalax.`scalatest`.value.map(_ % Test),
    libraryDependencies ++= libScalax.`simple-induction`.value,
    libraryDependencies ++= libScalax.`scala-collection-compat`.value,
    useKindProjector
  )
