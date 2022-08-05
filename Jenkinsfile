pipeline{
    agent any
    environment {
        //Project Configurations
        reportUrl = "http://localhost:8080/job/$env.JOB_NAME/$env.BUILD_NUMBER/cucumber-html-reports/overview-failures.html"
    }
    stages{
        stage('compile'){
            steps{
                withMaven(maven:'maven3'){
                    sh "mvn clean install"
                }
            }

        }
        stage('test'){
            steps{
                withMaven(maven:'maven3'){
                    sh "mvn test"
                }
            }
        }
        stage('cucumber reports'){
            steps{
                cucumber buildStatus:"UNSTABLE",
                         fileIncludePattern: '**/json-reports/*.json',
                         jsonReportDirectory: 'target'

            }
        }
    }
    post {
      	     failure {
      	      echo "Test failed"
                          cucumber buildStatus: 'FAIL',
                                       failedFeaturesNumber: 1,
                                       failedScenariosNumber: 1,
                                       skippedStepsNumber: 1,
                                       failedStepsNumber: 1,
                                       fileIncludePattern: '**/*.json',
                                       sortingMethod: 'ALPHABETICAL'

      	     }
      	      success {
              echo "Test succeeded"
                         cucumber buildStatus: 'SUCCESS',
                                                failedFeaturesNumber: 0,
                                                failedScenariosNumber: 0,
                                                skippedStepsNumber: 0,
                                                failedStepsNumber: 0,
                                                fileIncludePattern: '**/*.json',
                                                sortingMethod: 'ALPHABETICAL'
              }

      }

}