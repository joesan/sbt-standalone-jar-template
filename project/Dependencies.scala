import sbt._

object Dependencies {
  val resolutionRepos = Seq(
    "Spray Repository" at "http://repo.spray.cc/"
  )

  // versions for all the used libraries
   object Versions {
    val kafka               = "0.8.0"
    val jodaTime            = "2.7"
    val sprayJson           = "1.3.2"
    val log4j               = "1.2.14"
  }

  object Libraries {
    val kafka                = "org.apache.kafka"   %% "kafka"                     % Versions.kafka
    val jodaTime             = "joda-time"          %  "joda-time"                 % Versions.jodaTime
    val sprayJson            = "io.spray"           %% "spray-json"                % Versions.sprayJson
    val log4j                = "log4j"              %  "log4j"                     % Versions.log4j
  }
}
