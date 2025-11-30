pipeline {
    agent { label 'windows' }

    tools {
        maven 'Maven_3.9'   // имя Maven из Jenkins Global Tool Configuration
        jdk 'JDK_11'        // имя JDK из Jenkins Global Tool Configuration
    }

    stages {
        stage('Сборка') {
            steps {
                bat 'mvn clean compile'
            }
        }
        stage('Тесты') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Запуск') {
            steps {
                bat 'mvn exec:java'
            }
        }
    }
}
