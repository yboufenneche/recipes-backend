pipeline {
  
  environment {
    registry = "yboufenneche/recipes-backend"
    registryCredential = 'docker_hub_credentials'
  } 

  agent any
  
  stages {
  
    stage("Build"){
    
      steps {
        echo 'Building the application...'
        sh 'mvn install'
      }
    }
      
    stage("Test"){
    
      steps {
        echo 'Testing the aplicaton...' 
      }
    }
      
    stage("Dockerize"){
    
      steps {
        echo 'Dockerizing the application...'
        script {
          dockerImage = docker.build recipes-backend + ":$BUILD_NUMBER"
        }
      }
    }
    
    stage("Push"){
    
      steps {
        echo 'Pushing the Docker image to Docker Hub...'
        script {
          docker.withRegistry( '', registryCredential ) {
            dockerImage.push()
          }
        }
      }
    }
    
    stage('Remove Unused docker image') {
      steps{
        sh "docker rmi $registry:$BUILD_NUMBER"
      }
    }
  }
}
