# Bazel Workspace Example

This repo contains java code for a simple application called hello_to. The main purpose is to demonstrate how the 
Bazel build system operates with targets, and dependencies.

The contents in this repo should be built using [bazel](https://bazel.build/)

## Pre-reqs

The following packages need to be installed

1. Bazel
2. Python
3. Docker

## Targets

There are three targets - 

1. A Java binary - `hello_to`
2. A Java library - `greeter`
3. A Docker image - `hello_to_image`

Command to build binary - `bazel build //:hello_to`

Once the application is built, it can be run in the following manner - 

* `bazel-bin/hello_to Avadhani`
* `bazel-bin/hello_to`

Command to build image - `bazel build //:hello_to_image`

The image can be run using - `bazel run //:hello_to_image`

