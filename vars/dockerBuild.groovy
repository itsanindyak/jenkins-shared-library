def call(String imageName, String imageTag, String dockerUser) {
    echo "========Docker Build started========"
    sh "docker build -t ${dockerUser}/${imageName}:${imageTag} ."
    echo "========Docker Build Done========"
}
