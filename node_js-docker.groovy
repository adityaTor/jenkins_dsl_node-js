pipeline {
    agent any
    stages {
        stage('Checkout'){
            steps{
                git url: 'https://github.com/wardviaene/node-demo-app.git'
            }
        }
    }
}