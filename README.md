# Bazel Workspace Example

This repo contains java code for a simple application called hello_to. The main purpose is to demonstrate how the 
Bazel build system operates with targets, and dependencies.

The contents in this repo should be built using [bazel](https://bazel.build/)

There are two targets - 

1. A Java binary - `hello_to`
2. A Java library - `greeter`

Command to build - `bazel build //:hello_to`

Once the application is built, it can be run in the following manner - 

* `bazel-bin/hello_to Avadhani`
* `bazel-bin/hello_to`
