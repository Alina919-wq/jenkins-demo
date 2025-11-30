pipeline {
    agent any
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
