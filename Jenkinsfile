pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
				timeout(time: 3, unit: 'MINUTES') {
					bat 'mvn install'
				}
            }
        }
    }
}