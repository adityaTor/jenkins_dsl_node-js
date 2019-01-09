pipeline {
    agent any
    stages {
        stage('Checkout'){
            git url: 'https://github.com/wardviaene/node-demo-app.git'
        }
    }
}