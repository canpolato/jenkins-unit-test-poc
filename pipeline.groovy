def call() {
    node {
        stage('Build') {
            echo 'Building...'
            // Simulate a build step
            sh 'make build'
        }
        stage('Test') {
            echo 'Testing...'
            // Simulate a test step
            sh 'make test'
        }
        stage('Deploy') {
            echo 'Deploying...'
            // Simulate a deploy step
            sh 'make deploy'
        }
    }
}

return this