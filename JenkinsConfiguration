pipeline{
    
    agent any
    
    stages{
        stage("Checkout"){
            steps{
               git url: "https://github.com/tahersam/Test", branch: "master"
            }
        }
        stage("Build"){
            steps{
               bat "mvn -DskipTest clean package"
            }
        }
        stage("Test"){
            steps{
               bat "mvn test"
            }
        }
    }
}
