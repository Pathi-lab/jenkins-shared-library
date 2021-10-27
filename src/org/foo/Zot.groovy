package org.foo

def checkOutFrom(repo) {
  //git url: "https://github.com/Pathi-lab/${repo}.git"
  sh 'git clone https://Pathi-lab:apparatus%40%A@github.com/Pathi-lab/Project1.git'
}

return this
