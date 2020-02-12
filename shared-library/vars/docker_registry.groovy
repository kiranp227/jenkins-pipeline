def call ()
  {
   echo "Push The Image To Docker Registry"
 
   withDockerRegistry(credentialsId: 'dockerhub-creds', url: "") {
                               sh 'docker push kiranp227/tomcat-helloworld:${BUILD_ID}'
                              }
  }

