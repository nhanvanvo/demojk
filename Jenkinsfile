pipeline {
    agent any

    stages {
        stage('Build Services') {
            steps {
                withSonarQubeEnv('My SonarQube Server') {
                    sh 'mvn clean install -Dmaven.test.skip=true sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.login=e029d0891047953ef42323104356079fc77ec138'
                }
            }
        }
        stage("Quality Gate") {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }
}