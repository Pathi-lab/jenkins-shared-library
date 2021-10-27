package com.util

class utils(

def checkOutFrom(repo) {
  git url: "git@github.com:jenkinsci/${repo}"
}
return this
)