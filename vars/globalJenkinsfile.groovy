def call(String repoName){
// This pipeline assumes that human approval happens through a PR
// to master.
//
// This is meant to be a shell to demonstrate where pipeline code would go
  pipeline {
    environment {
    }
    agent {
    }
    stages {
      stage('Prep') {
        steps {
          sh 'printenv'
        }
      }
      stage('Test') {
        steps {
          parallel(
            "Unit": {
              sh '''
                echo "unit testing..."
              '''
            },
            "Lint": {
              sh '''
                 echo "linting..."
              '''
            }
            ,
            "Functional": {
              sh '''
                echo "runing functional tests..."
              '''
            }
          )
        }
      }
      stage('Build') {
        steps {
          sh '''
            echo "compiling...  compiling..."
          '''
        }
      }
      stage('Deploy') {
        when {
          branch 'master'
        }
        steps {
          sh '''
            echo "deploying..."
          '''
        }
      }
    }
  } //pipeline
}
