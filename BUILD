
load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "hello_to",
    srcs = glob(["src/main/com/example/Hello.java"]),
    main_class = "com.example.Hello",
    deps = ["//src/main/com/example/greeting:greeter"],
)

load("@io_bazel_rules_docker//java:image.bzl", "java_image")

java_image(
    name = "hello_to_image",
    srcs = ["src/main/com/example/Hello.java"],
    main_class = "com.example.Hello",
    deps = ["//src/main/com/example/greeting:greeter"],
)

