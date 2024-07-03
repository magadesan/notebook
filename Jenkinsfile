pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh '''
                echo "Building.."
                ls -l
                '''
            }
        }
        stage('Test') {
            steps {
                sh '''
                echo "Testing.."
                pwd
                '''
            }
        }
        stage('Deploy') {
            steps {
                sh '''
                echo "Deploying...."
                more Jenkinsfile
                '''
            }
        }
    }
}
