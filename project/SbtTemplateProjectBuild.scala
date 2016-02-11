import sbt._
import Keys._

object SbtTemplateProjectBuild extends Build {

  import Dependencies._
  import BuildSettings._

  // Configure prompt to show current project
  override lazy val settings = super.settings :+ {
    shellPrompt := { s => Project.extract(s).currentProject.id + " > " }
  }

  // Define our project, with basic project information and library dependencies
  lazy val project = Project("sbt-template-project", file("."))
    .settings(buildSettings: _*)
    .settings(
      libraryDependencies ++= Seq(
        Libraries.log4j,
        Libraries.kafka,
        Libraries.jodaTime,
        Libraries.sprayJson
        // Add your additional libraries here (comma-separated)...
      )
    )
}