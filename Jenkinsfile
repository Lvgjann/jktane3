pipeline {
  agent any
  stages {
    stage('Build print') {
      steps {
        echo 'Building....'
      }
    }

    stage('Build') {
      steps {
        sh 'mvn clean install -Dlicense.skip=True'
      }
    }

  }
}