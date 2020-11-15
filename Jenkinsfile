pipeline {
  
  environment {
    registry = "yboufenneche/recipes-backend"
    registryCredential = 'my_credentials'
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
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
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
  }
}
