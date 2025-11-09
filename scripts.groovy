def buildapp() {
    echo "Building Branch ${params.BRANCH_VERSION}..."
}

def testapp(){
    echo " testing the branch ${params.BRANCH_VERSION}..."
}

def deployapp(){
    echo "Deploying branch ${params.BRANCH_VERSION}"
}

return this