def call(String DockerHubUserName, String ProjectName, String Tag){
  echo "========Docker Build started========"
  sh "docker build -t ${DockerHubUserName}/${ProjectName}:${ImageTag} ."
  echo "========Docker Build Done========"
}
