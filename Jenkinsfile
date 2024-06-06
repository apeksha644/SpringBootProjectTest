pipeline {
    agent any

    stages {
        stage('Clean') {
            steps {
                bat 'mvn clean'
            }
        }

        stage('Install') {
            steps {
                bat 'mvn install'
            }
        }

        stage('Rename WAR file') {
            steps {
                bat 'ren "C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\cicd-multi-pipeline_${BRANCH_NAME}\\target\\DemoSpringBoot-0.0.1-SNAPSHOT.war" "myapp.war"'
            }
        }

        stage('Copy WAR file to Tomcat') {
            steps {
                bat 'xcopy "C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\cicd-multi-pipeline_${BRANCH_NAME}\\target\\myapp.war" "C:\\Program Files\\Apache Software Foundation\\Tomcat 10.1\\webapps" /Y'
            }
        }
    }
}
