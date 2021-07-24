load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "hello_to",
    srcs = glob(["src/main/com/example/Hello.java"]),
    main_class = "com.example.Hello",
    deps = ["//src/main/com/example/greeting:greeter"],
)
