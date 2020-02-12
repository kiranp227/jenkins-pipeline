def call ()
  {
   echo "Deploy the Application In Docker Environment"
   sh 'docker rm kirans-app'
   sh 'docker run -d --restart always -p 8081:8080 --name kirans-app -v /home/ubuntu/app/:/usr/local/tomcat/webapps/:ro \
       kiranp227/tomcat-helloworld:${BUILD_ID}'

  }
