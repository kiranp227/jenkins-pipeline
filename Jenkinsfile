node () {

	stage ('multi_scm - Checkout') {
	    dir('repo1') {
	        git 'https://github.com/kiranp227/game-of-life.git'
	    }
	    dir('repo2') {
	        git 'https://github.com/kiranp227/salt.git'
	    }
	    sh label: '', script: '''pwd
	    ls -l repo1
	    echo seccond
	    ls -l repo2
	    echo done123
	    docker --tlsverify --tlscacert=/home/ubuntu/ca.pem --tlscert=/home/ubuntu/cert.pem --tlskey=/home/ubuntu/key.pem -H=ip-172-31-94-92:2376'''
    
}}
