def call ()
   {
    echo "Build the Hello World Image"

    sh 'docker build -t kiranp227/tomcat-helloworld:${BUILD_ID} .'

}
