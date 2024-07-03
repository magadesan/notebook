pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                ls -l
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                pwd
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                more Jenkinsfile
            }
        }
    }
}
