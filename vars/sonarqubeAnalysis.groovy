def call(String SonarQubeAPI, String ProjectName, String ProjectKey) {
  withSonarQubeEnv("${SonarQubeAPI}") {
    sh """
      echo "Using SonarQube Scanner from: \$SONAR_SCANNER_HOME"
      \$SONAR_SCANNER_HOME/bin/sonar-scanner \
        -Dsonar.projectName=${ProjectName} \
        -Dsonar.projectKey=${ProjectKey} \
        -Dsonar.sources=. \
        -Dsonar.host.url=\$SONAR_HOST_URL \
        -Dsonar.login=\$SONAR_AUTH_TOKEN \
        -X
    """
  }
}
