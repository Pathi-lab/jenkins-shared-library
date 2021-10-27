package org.foo

def checkOutFrom(repo) {
  git url: "git@github.com:Pathi-lab/${repo},git"
}

return this
