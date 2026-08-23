lazy val developer1 = Developer(
  id = "Mars Liu",
  name = "Liu Xin",
  email = "mars.liu@outlook.com",
  url = uri("https://marchliu.github.io/")
)

lazy val developer2 = Developer(
  id = "djx314",
  name = "djx314",
  email = "djx314@sina.cn",
  url = uri("https://github.com/djx314")
)

ThisBuild / version              := "0.0.1-M28"
ThisBuild / organization         := "net.scalax.simple"
ThisBuild / organizationName     := "Scalax"
ThisBuild / organizationHomepage := Some(uri("https://github.com/scalax"))
ThisBuild / scmInfo              := Some(
  ScmInfo(
    uri("https://github.com/scalax/simple-adt"),
    "scm:git@github.com:scalax/simple-adt.git"
  )
)
ThisBuild / developers           := List(developer1, developer2)
ThisBuild / description          := "Simple, and scalable. Use it to subvert the author's imagination."
ThisBuild / licenses             := List(License("MIT License", uri("https://github.com/scalax/simple-adt/blob/main/LICENSE")))
ThisBuild / homepage             := Some(uri("https://github.com/scalax/simple-adt"))
ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishMavenStyle    := true
ThisBuild / versionScheme        := Some("early-semver")
