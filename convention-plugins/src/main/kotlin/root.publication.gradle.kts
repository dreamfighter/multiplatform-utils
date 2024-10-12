plugins {
    id("io.github.gradle-nexus.publish-plugin")
}

allprojects {
    group = "com.github.dreamfighter.multiplatform"
    version = "0.0.4"
}

/* use this for publishing using plugins io.github.gradle-nexus.publish-plugin
nexusPublishing {
    // Configure maven central repository
    // https://github.com/gradle-nexus/publish-plugin#publishing-to-maven-central-via-sonatype-ossrh
    repositories {

        sonatype {  //only for users registered in Sonatype after 24 Feb 2021

            username = localProperties["nexus.username"].toString()
            password = localProperties["nexus.password"].toString()
            nexusUrl.set(uri("https://nexus.bandung.dev/repository/maven-bd/"))
            /*snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))*/
        }
    }
}
 */