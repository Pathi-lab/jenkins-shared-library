package org.foo

def checkOutFrom(repo) {
  //git url: "https://github.com/Pathi-lab/${repo}.git"
  sh 'git clone https://github.com/Pathi-lab/${repo}.git'
}

return this
